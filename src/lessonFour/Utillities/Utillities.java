package lessonFour.Utillities;

import lessonFour.Objects.Fiz;

import java.util.Arrays;

import static lessonFour.Enums.Sex.MALE;

public class Utillities {

    protected static void ageSort(Fiz[] clients) {
        Arrays.sort(clients);
    }

    protected static Fiz[] equivalentCheck(Fiz[] clients) {
        Fiz[] tmp = new Fiz[10];
        int g = 0;
        for (int i = 0; i < clients.length; i++) {
            if (i + 1 < clients.length) {
                if (!clients[i].equals(clients[i + 1])) {
                    tmp[g++] = clients[i];
                }
            } else tmp[g++] = clients[i];
        }
        return tmp;
    }


    protected static Fiz[] sexFilter(Fiz[] clients) {
        Fiz[] tmp = new Fiz[5];
        int g = 0;
        for (Fiz client : clients) {
            if (client.getSex() == MALE) {
                tmp[g++] = client;
            }
        }
        return tmp;
    }
}





