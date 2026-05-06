package by.lessons.practics.class1;

import java.util.Scanner;

public class PW1 {
    public static void main(String[] args) {
        System.out.println("1. Дано уравнение: (10+12)*find1=88;. Найти значение find1");
        int find1;
        find1 = 88 / (10 + 12);
        System.out.println("znachenie find1 = " + find1);
        System.out.println("===========================================");

        System.out.println("4. Введите x,y,z. К числу x прибавьте y, число y умножьте на z.\n" +
                "Используйте операции присваивания. Результат выведите в консоль");
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите x");
        int x = vvod.nextInt();
        System.out.println("Введите y");
        int y = vvod.nextInt();
        System.out.println("Введите z");
        int z = vvod.nextInt();
        int find2 = x + y * z;
        System.out.println("znachenie find2 = " + find2);
        System.out.println("===========================================");

        System.out.println("5. Дано уравнение 213/find3+258/find3+60=217");
        float find3;
        find3 = (213 + 258) / (217 - 60);
        System.out.println("znachenie find3 = " + find3);
        System.out.println("===========================================");

        System.out.println("6. Даны значения: a=5; b=2; c=a*b; Расставьте операции инкремента декремента так,\n" +
                "чтобы после выполнения операции (c=x*y) с=10; x=6; y=1");
        int a = 5, b = 2, c;
        c = a++ * b--;
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}