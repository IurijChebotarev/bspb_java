package lessonSix;

import lessonSix.objects.Fiz;
import java.util.Set;
import java.util.TreeSet;
import static lessonSix.enums.Sex.FEMALE;
import static lessonSix.enums.Sex.MALE;
import static lessonSix.utilities.Utillities.*;

public class Main {

    public static void main(String[] args) {
        Fiz client1 = new Fiz("Андрей Семенович И", 21, MALE);
        Fiz client2 = new Fiz("Анна Владимировна Т", 25, FEMALE);
        Fiz client3 = new Fiz("Светлана Юрьевна О", 30, FEMALE);
        Fiz client4 = new Fiz("Павел Михайлович З", 40, MALE);
        Fiz client5 = new Fiz("Юрий Александрович Ч", 35, MALE);
        Fiz client6 = new Fiz("Евгения Владимировна К", 26, FEMALE);
        Fiz client7 = new Fiz("Анна Олеговна Т", 32, FEMALE);
        Fiz client8 = new Fiz("Виктор Олегович Р", 45, MALE);
        Fiz client9 = new Fiz("Иван Степанович К", 50, MALE);
        Fiz client10 = new Fiz("Мария Ивановна Л", 65, FEMALE);
        Fiz client11 = new Fiz("Андрей Семенович И", 21, MALE);

        Set<Fiz> bspbClients = new TreeSet<>();
        bspbClients.add(client1);
        bspbClients.add(client2);
        bspbClients.add(client3);
        bspbClients.add(client4);
        bspbClients.add(client5);
        bspbClients.add(client6);
        bspbClients.add(client7);
        bspbClients.add(client8);
        bspbClients.add(client9);
        bspbClients.add(client10);
        bspbClients.add(client11);

        sexFilter(bspbClients, MALE);
        System.out.println(bspbClients);
    }
}

