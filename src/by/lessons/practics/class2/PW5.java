package by.lessons.practics.class2;

public class PW5 {
    public static void main(String[] args) {
        System.out.println("5. Создать массив чисел от 1 до 100. Вывести полученный массив");

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int j = 0; j < array.length; j++) {
            int a = array[j];
            System.out.print(a + " ");
        }
    }
}
