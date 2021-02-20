package lessonThree;

public class LessonThree {

    public static void main(String[] args) {

        Clients client1 = new Clients("Андрей Семенович И", 21, 'М');
        Clients client2 = new Clients("Анна Владимировна Т", 25, 'Ж');
        Clients client3 = new Clients("Светлана Юрьевна О", 30, 'Ж');
        Clients client4 = new Clients("Павел Михайлович З", 40, 'М');
        Clients client5 = new Clients("Юрий Александрович Ч", 35, 'М');
        Clients client6 = new Clients("Евгения Владимировна К", 26, 'Ж');
        Clients client7 = new Clients("Анна Олеговна Т", 32, 'Ж');
        Clients client8 = new Clients("Виктор Олегович Р", 45, 'М');
        Clients client9 = new Clients("Иван Степанович К", 50, 'М');
        Clients client10 = new Clients("Мария Ивановна Л", 65, 'Ж');
        Clients client11 = new Clients("Андрей Семенович И", 21, 'М');

        Clients[][] bspbClients = new Clients[][]{{client1}, {client2}, {client3}, {client4}, {client5}, {client6}, {client7}, {client8}, {client9}, {client10}, {client11}};

        ageSort(bspbClients);
        equivalentCheck(bspbClients);
        Clients[][] uniqueBspbClients = equivalentCheck(bspbClients);
        sexFilter(uniqueBspbClients);

    }

    private static void ageSort(Clients[][] clients) {
        for (int i = 0; i < clients.length; i++) {
            for (int j = 0; j < clients[i].length; j++) {
                for (int k = 0; k < clients.length; k++) {
                    for (int n = 0; n < clients[k].length; n++) {
                        if (clients[k][n].getAge() > clients[i][j].getAge()) {
                            Clients tmp = clients[k][n];
                            clients[k][n] = clients[i][j];
                            clients[i][j] = tmp;
                        }
                    }
                }
            }
        }
    }

    public static Clients[][] equivalentCheck(Clients[][] clients) {
        Clients[][] tmp = new Clients[10][1];
        int g = 0;
        for (int i = 0; i < clients.length; i++) {
            if (i + 1 < clients.length) {
                if (!clients[i][0].equals(clients[i + 1][0])) {
                    tmp[g++][0] = clients[i][0];
                }
            } else tmp[g++][0] = clients[i][0];
        }
        return tmp;
    }


    private static void sexFilter(Clients[][] clients) {
        for (Clients[] client : clients) {
            for (Clients value : client) {
                if (value.getSex() == 'М') {
                    System.out.println(value.getName() + " " + value.getAge());
                }
            }
        }
    }
}































