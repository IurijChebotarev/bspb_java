package ru.bspb.lessonTen;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.util.UriComponentsBuilder;
import ru.bspb.lessonTen.enums.Job;
import ru.bspb.lessonTen.enums.User;
import ru.bspb.lessonTen.pojo.DataItem;
import ru.bspb.lessonTen.pojo.GetUsersResponse;
import ru.bspb.lessonTen.pojo.PostUsersRequest;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;

public class Utillities {
    static HttpClient httpClient = HttpClient.newHttpClient();
    static ObjectMapper mapper = new ObjectMapper();

    public static List<DataItem> collectUsersList() throws IOException, InterruptedException {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("reqres.in")
                .pathSegment("api", "users");

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .header("accept", "application/json")
                .uri(uriBuilder.build().toUri())
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        GetUsersResponse allUsers = mapper.readValue(response.body(), GetUsersResponse.class);

        List<DataItem> dataList = allUsers.getData();
        int count = allUsers.getTotalPages();
        int page = allUsers.getPage();
        while (count > allUsers.getPage()) {
            request = HttpRequest.newBuilder()
                    .GET()
                    .header("accept", "application/json")
                    .uri(uriBuilder.queryParam("page", page + 1).build().toUri())
                    .build();
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            allUsers = mapper.readValue(response.body(), GetUsersResponse.class);
            dataList.addAll(allUsers.getData());
            System.out.println(response.statusCode());
            System.out.println(response.body());
            uriBuilder.replaceQuery("");
        }
        return dataList;
    }

    public static List<DataItem> filterByName(List<DataItem> list, User user) {
        return list.stream()
                .filter(name -> name.getFirstName().equals(user.user()))
                .collect(Collectors.toList());
    }

    public static void deleteUsers(List<DataItem> list) throws IOException, InterruptedException {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("reqres.in")
                .pathSegment("api", "users");

        for (int i = 0; i <= list.size() - 1; i++) {
            HttpRequest request = HttpRequest.newBuilder()
                    .DELETE()
                    .uri(uriBuilder.pathSegment(list.get(i).getId().toString()).build().toUri())
                    .build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
            uriBuilder.replacePath("api/users");

        }
    }

    public static void postUsers(List<DataItem> list, Job job) throws IOException, InterruptedException {
        for (int i = 0; i <= list.size() - 1; i++) {
            PostUsersRequest user = new PostUsersRequest();
            user.setName(list.get(i).getFirstName());
            user.setJob(job.job());
            String body = mapper.writeValueAsString(user);

            HttpRequest post = HttpRequest.newBuilder()
                    .POST(HttpRequest.BodyPublishers.ofString(body))
                    .header("content-type", "application/json")
                    .uri(URI.create("https://reqres.in/api/users"))
                    .build();
            HttpResponse<String> postResponse = httpClient.send(post, HttpResponse.BodyHandlers.ofString());
            System.out.println(postResponse.statusCode());
            System.out.println(postResponse.body());


        }
    }
}
