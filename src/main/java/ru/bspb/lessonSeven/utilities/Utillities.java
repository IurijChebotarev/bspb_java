package ru.bspb.lessonSeven.utilities;

import ru.bspb.lessonSeven.enums.Sex;
import ru.bspb.lessonSeven.objects.Fiz;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Utillities {

    public static List<Fiz> resultBspbClientsListCreator(List<Fiz> clients, Sex sex) {
        return clients.stream()
                .sorted(Comparator.comparing(Fiz::getAge))
                .distinct()
                .filter(client -> client.getSex().equals(sex))
                .collect(Collectors.toList());
    }
}





