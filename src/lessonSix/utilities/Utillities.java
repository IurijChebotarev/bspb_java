package lessonSix.utilities;

import lessonSix.enums.Sex;
import lessonSix.objects.Fiz;
import java.util.Set;

public class Utillities {

    public static void sexFilter(Set<Fiz> clients, Sex sex) {
        clients.removeIf(client -> client.getSex() != sex);
    }
}





