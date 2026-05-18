package by.lessons.practics.class2;

import java.util.Scanner;

public class PW7 {
    public static void main(String[] args) {
        System.out.println("7. Ввести число с консоли, которое не заканчивается на 0. \n" +
                "Вывести среднее значение всех цифр в числе. Использовать оператор %. (while)");

        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число");
        int v = vvod.nextInt();

        double i = 0, sum = 0;
        while (v > 0) {
            i++;
            sum += v % 10;
            v /= 10;
        }
        System.out.println("Среднее значение: " + (sum / i));
    }
}
