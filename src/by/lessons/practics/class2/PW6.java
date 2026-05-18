package by.lessons.practics.class2;

public class PW6 {
    public static void main(String[] args) {
        System.out.println("6. Создать массив из чисел. Вывести макс и мин число.");
        int array[] = {3, 6, 8, 2, 0, 1, 7};
        int min = 0, max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("max " + max + "\nmin " + min);
    }
}
