package by.lessons.practics.class2;

import java.util.Scanner;

public class PW8 {
    public static void main(String[] args) {
        System.out.println("8. Ввести число с консоли, которое не заканчивается на 0. \n" +
                "Вывести макс и мин цифру в числе. Использовать оператор %. (while)");

        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число");
        int v = vvod.nextInt();

        int min = 100, max = 0;

        if (v%10==0){
            System.out.println("Число не должно заканчиваться на 0");
        }else {
            while (v > 0) {
                int a = v % 10;
                if (a < min) {
                    min = a;
                }
                if (a > max) {
                    max = a;
                }
                v = v / 10;
            }
            System.out.println("min " + min);
            System.out.println("max " + max);
        }
    }
}
