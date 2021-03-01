package lessonFour.Helpers;

import lessonFour.Objects.Clients;
import lessonFour.Objects.Fiz;
import lessonFour.Utillities.Utillities;

import java.util.Arrays;

public class ClientsHelper extends Utillities {
    public static void clientsResulter(Clients[] clients) {
        if (clients instanceof Fiz[]) {
            ageSort((Fiz[]) clients);
            equivalentCheck((Fiz[]) clients);
            Fiz[] uniqueBspbClients = equivalentCheck((Fiz[]) clients);
            sexFilter(uniqueBspbClients);
            Fiz[] manBspbClients = sexFilter(uniqueBspbClients);
            System.out.println(Arrays.toString(manBspbClients));
        }
    }

}
