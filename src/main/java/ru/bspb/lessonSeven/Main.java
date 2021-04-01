package ru.bspb.lessonSeven;

import ru.bspb.lessonSeven.objects.Fiz;

import java.util.ArrayList;
import java.util.List;

import static ru.bspb.lessonSeven.enums.Sex.FEMALE;
import static ru.bspb.lessonSeven.enums.Sex.MALE;
import static ru.bspb.lessonSeven.utilities.Utillities.*;

public class Main {

    public static void main(String[] args) {

        List<Fiz> bspbClients = new ArrayList<>();
        bspbClients.add(new Fiz("Андрей Семенович И", 21, MALE));
        bspbClients.add(new Fiz("Анна Владимировна Т", 25, FEMALE));
        bspbClients.add(new Fiz("Светлана Юрьевна О", 30, FEMALE));
        bspbClients.add(new Fiz("Павел Михайлович З", 40, MALE));
        bspbClients.add(new Fiz("Юрий Александрович Ч", 35, MALE));
        bspbClients.add(new Fiz("Евгения Владимировна К", 26, FEMALE));
        bspbClients.add(new Fiz("Анна Олеговна Т", 32, FEMALE));
        bspbClients.add(new Fiz("Виктор Олегович Р", 45, MALE));
        bspbClients.add(new Fiz("Иван Степанович К", 50, MALE));
        bspbClients.add(new Fiz("Мария Ивановна Л", 65, FEMALE));
        bspbClients.add(new Fiz("Андрей Семенович И", 21, MALE));


        List<Fiz> BspbClientsResult = resultBspbClientsListCreator(bspbClients, MALE);
        System.out.println(BspbClientsResult);
    }
}

