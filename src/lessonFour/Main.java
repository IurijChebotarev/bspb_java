package lessonFour;

import lessonFour.Objects.Fiz;

import static lessonFour.Enums.Sex.FEMALE;
import static lessonFour.Enums.Sex.MALE;
import static lessonFour.Helpers.ClientsHelper.clientsResulter;

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

        Fiz[] bspbClients = new Fiz[]{client1, client2, client3, client4, client5, client6, client7, client8, client9, client10, client11};

        clientsResulter(bspbClients);
    }
}
