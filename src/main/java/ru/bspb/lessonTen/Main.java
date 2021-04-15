package ru.bspb.lessonTen;

import ru.bspb.lessonTen.enums.Job;
import ru.bspb.lessonTen.enums.User;
import ru.bspb.lessonTen.pojo.DataItem;

import java.io.IOException;
import java.util.List;

import static ru.bspb.lessonTen.Utillities.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<DataItem> list = collectUsersList();
        List<DataItem> usersList = filterByName(list, User.GEORGE);
        deleteUsers(usersList);
        postUsers(usersList, Job.TESTER);

    }
}
