package by.lessons.practics.class1;

import java.util.Scanner;

public class PW_IF {
    public static void main(String[] args) {

        System.out.println("1. Ввести числа a и b с консоли. \n" +
                "Если a>b, то вывести разность (a-b) передав ее в новую переменную.\n" +
                "Иначе если a=b  вывести сумму этих чисел.\n" +
                "Иначе, вывести разность (b-a). \n" +
                "Результат вычисления передать в новую переменную.");
        Scanner vvod = new Scanner(System.in);
        System.out.print("Введите a ");
        int a = vvod.nextInt();
        System.out.print("Введите b ");
        int b = vvod.nextInt();
        int c;
        if (a > b) {
            c = (a - b);
            System.out.println("raznost (a - b) = " + c);
        } else if (a == b) {
            c = (a + b);
            System.out.println("symma (a + b) = " + c);
        } else {
            c = (b - a);
            System.out.println("raznost (b - a) = " + c);
        }
        System.out.println("===================================");

        System.out.println("2. Ввести числа m и n с консоли. \n" +
                "Если m>n и n не равно 0-вывести результат деления m на n.\n" +
                "Иначе если m не равно 0, вывести n/m, \n" +
                "Иначе вывести сумму чисел m и n.");
        //Scanner vvodMN = new Scanner(System.in);
        System.out.print("Введите m ");
        int m = vvod.nextInt();
        System.out.print("Введите n ");
        int n = vvod.nextInt();
        if (m > n && n != 0) {
            System.out.println("m / n = " + m / n);
        } else if (m != 0) {
            System.out.println("n / m = " + n / m);
        } else System.out.println("m + n = " + (m + n));
        System.out.println("===================================");

        System.out.println("3. На вход дано число. Определить, делиться ли оно на три. \n" +
                "Вывести соответствующий текст.");
        System.out.print("Введите ch ");
        int ch = vvod.nextInt();
        if (ch % 3 == 0) {
            System.out.println("ch делится на 3 без остатка");
        } else System.out.println("ch не делится на 3");
        System.out.println("===================================");

        System.out.println("4. На вход дано число. \n" +
                "Определить, делиться ли оно на 3 и на 7, \n" +
                "если нет, тогда проверить делиться ли оно на 3, \n" +
                "если не делиться, то проверить, делиться ли оно на 7. \n" +
                "Вывести соответствующий текст.");
        System.out.print("Введите new_ch ");
        int new_ch = vvod.nextInt();
        if (new_ch % 3 == 0 && new_ch % 7 == 0) {
            System.out.println("new_ch делится и на 3 и на 7 без остатка");
        } else if (new_ch % 3 == 0) {
            System.out.println("ch делится на 3 без остатка");
        } else if (new_ch % 7 == 0) {
            System.out.println("ch делится на 7 без остатка");
        }
        System.out.println("===================================");

        System.out.println("6. На вход даны три числа. Определить максимальное из них");
        System.out.print("Введите ch1 ");
        int ch1 = vvod.nextInt();
        System.out.print("Введите ch2 ");
        int ch2 = vvod.nextInt();
        System.out.print("Введите ch3 ");
        int ch3 = vvod.nextInt();
        int max = ch1;
        if (ch2 > max) max = ch1;
        if (ch3 > max) max = ch3;
        System.out.println("naibolshee chislo = " +max);
    }
}