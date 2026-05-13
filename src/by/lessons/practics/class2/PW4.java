package by.lessons.practics.class2;

public class PW4 {
    public static void main(String[] args) {
        System.out.println("4. Вывести только нечётные числа от 1 до 100.");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
