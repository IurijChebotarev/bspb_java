package ru.bspb;

public class LessonTwo {

    public static void main(String[] args) {

        String[] names = {"Андрей Семенович И", "Анна Владимировна Т", "Светлана Юрьевна О", "Павел Михайлович З", "Юрий Александрович Ч", "Евгения Владимировна К", "Анна Олеговна Т", "Виктор Олегович Р", "Иван Степанович К", "Мария Ивановна Л",};
        char[] sex = {'М', 'Ж', 'Ж', 'М', 'М', 'Ж', 'Ж', 'М', 'М', 'Ж',};
        int[] age = {21, 25, 30, 40, 35, 26, 32, 45, 50, 65};

        ageSort(age,sex,names);
        sexFilter(sex,names);


    }

        private static void ageSort(int[] a, char[] s, String[] n) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    char tmp2 = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = tmp2;
                    String tmp3 = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = tmp3;


                }
            }
        }
    }
        private static void sexFilter(char[] s2, String[] n2) {
            for (int j = 0; j < s2.length; j++) {
                if (s2[j] == 'М')
                    System.out.println(n2[j]);
            }
    }
}





