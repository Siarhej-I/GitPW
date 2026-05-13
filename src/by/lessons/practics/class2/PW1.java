package by.lessons.practics.class2;

public class PW1 {
    public static void main(String[] args) {
        System.out.println("1. Необходимо, чтобы программа отображала следующую последовательность чисел:\n" +
                "7 14 21 28 35 42 49 56 63 70 77 84 91 98 (while)\n" +
                "==================================================");
        int a = 0;
        while (a < 98) {
            a += 7;
            System.out.print(a + " ");
        }

    }
}
