package by.lessons.practics.class2;

public class PW2 {
    public static void main(String[] args) {
        System.out.println("2. Написать программу, которая посчитает сумму первых 10 чисел (while)");
        int sum = 0, a=0;

        while (a<10){
            a++;
            sum+=a;
        }
        System.out.println(sum);

    }
}
