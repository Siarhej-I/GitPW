package by.lessons.practics.class2;

public class PW3 {
    public static void main(String[] args) {
        System.out.println("3. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой\n" +
                "Вывести каждый десяток от 1 до 100. (for)");
        for (int i = 100; i > 0; i--) {
            if (i != 1) {
                System.out.print(i + ",");
            } else System.out.print(i + "\n");

        }

        System.out.println("=============================");
        for (int j = 0; j <= 100; j += 10) {
            System.out.print(j + " ");
        }
    }
}
