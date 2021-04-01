package ru.bspb.lessonFour;

import ru.bspb.lessonFour.objects.Fiz;

import java.util.Arrays;

import static ru.bspb.lessonFour.enums.Sex.FEMALE;
import static ru.bspb.lessonFour.enums.Sex.MALE;
import static ru.bspb.lessonFour.utilities.Utillities.*;

public class Main {

    public static void main(String[] args) {

        Fiz[] bspbClients = new Fiz[]{
                new Fiz("Андрей Семенович И", 21, MALE),
                new Fiz("Анна Владимировна Т", 25, FEMALE),
                new Fiz("Светлана Юрьевна О", 30, FEMALE),
                new Fiz("Павел Михайлович З", 40, MALE),
                new Fiz("Юрий Александрович Ч", 35, MALE),
                new Fiz("Евгения Владимировна К", 26, FEMALE),
                new Fiz("Анна Олеговна Т", 32, FEMALE),
                new Fiz("Виктор Олегович Р", 45, MALE),
                new Fiz("Иван Степанович К", 50, MALE),
                new Fiz("Мария Ивановна Л", 65, FEMALE),
                new Fiz("Андрей Семенович И", 21, MALE)
        };

        ageSort(bspbClients);
        equivalentCheck(bspbClients);
        Fiz[] uniqueBspbClients = equivalentCheck(bspbClients);
        sexFilter(uniqueBspbClients, MALE);
        Fiz[] manBspbClients = sexFilter(uniqueBspbClients, MALE);
        System.out.println(Arrays.toString(manBspbClients));
    }
}

