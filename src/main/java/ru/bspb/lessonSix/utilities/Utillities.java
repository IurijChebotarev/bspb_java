package ru.bspb.lessonSix.utilities;

import ru.bspb.lessonSix.enums.Sex;
import ru.bspb.lessonSix.objects.Fiz;
import java.util.Set;

public class Utillities {

    public static void sexFilter(Set<Fiz> clients, Sex sex) {
        clients.removeIf(client -> client.getSex() != sex);
    }
}





