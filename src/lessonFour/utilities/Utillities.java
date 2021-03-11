package lessonFour.utilities;

import lessonFour.enums.Sex;
import lessonFour.objects.Fiz;

import java.util.Arrays;


public class Utillities {

    public static void ageSort(Fiz[] clients) {
        Arrays.sort(clients);
    }

    public static Fiz[] equivalentCheck(Fiz[] clients) {
        Fiz[] tmp = new Fiz[clients.length];
        int g = 0;
        for (int i = 0; i < clients.length; i++) {
            if (i + 1 < clients.length) {
                if (!clients[i].equals(clients[i + 1])) {
                    tmp[g++] = clients[i];
                }
            } else tmp[g++] = clients[i];
        }
        Fiz[] uniqueClients = new Fiz[g];
        for (int v = 0; v < tmp.length; v++) {
            if (tmp[v] != null) {
                uniqueClients[v] = tmp[v];
            }
        }
        return uniqueClients;
    }


    public static Fiz[] sexFilter(Fiz[] clients, Sex sex) {
        Fiz[] tmp = new Fiz[clients.length];
        int g = 0;
        for (Fiz client : clients) {
            if (client.getSex() == sex) {
                tmp[g++] = client;
            }
        }
        Fiz[] manClients = new Fiz[g];
        for (int v = 0; v < tmp.length; v++) {
            if (tmp[v] != null) {
                manClients[v] = tmp[v];
            }
        }
        return manClients;
    }
}





