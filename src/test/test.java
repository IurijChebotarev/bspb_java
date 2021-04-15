package test;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class test {
    public static void main(String[] args) {
        boolean totalResult=result();
        System.out.println(totalResult);
    }

    public static boolean result() {
        ArrayList<Date> dates = new ArrayList<>();
        long rangebegin = Timestamp.valueOf("2013-02-08 00:00:00").getTime();
        long rangeend = Timestamp.valueOf("2020-02-08 00:58:00").getTime();
        for (int i = 0; i < 10; i++) {
            long diff = rangeend - rangebegin + 1;
            Timestamp rand = new Timestamp(rangebegin + (long) (Math.random() * diff));
            dates.add(rand);
        }

        dates.sort(Comparator.comparing(o -> o.getTime()));
        System.out.println("dates:" + dates);
        ArrayList<Date> dates2 = new ArrayList<>(dates);
        dates2.remove(dates.get(0));
        dates2.add(dates.get(1));
        System.out.println("dates2:" + dates2);

        boolean result=false;
        for (int i = 0; i < dates.size(); i++) {
            if (dates.get(i).getTime() != dates2.get(i).getTime()) {


                result=false;
            }
            else
                result=true;
        }
        return result;

    }
}




