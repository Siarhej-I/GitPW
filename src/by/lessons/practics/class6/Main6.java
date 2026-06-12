package by.lessons.practics.class6;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        /*1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.*/
        List<String> listCol = new ArrayList<>();

        /*1.2Добавить  пару записей (Привет, Как дела, Праздник, Суфле)*/
        listCol.add("Привет");
        listCol.add("Как дела");
        listCol.add("Праздник");
        listCol.add("Суфле");

        /*1.3 Вывести все записи.*/
        for (String l : listCol) {
            System.out.println(l);
        }

        /*1.4 Проверить, содержит ли коллекция слово Конфета*/
        if (listCol.contains("конфета")) {
            System.out.println("конфета в коллекции");
        }else System.out.println("конфета не в коллекции");

        /*1.5 Посчитать количество элементов в коллекции*/
        System.out.println("количество элементов в коллекции: " + listCol.size());

        /*2. Условие: Создайте ArrayList<String> для хранения списка покупок.
        Добавь в него 5 товаров.
        Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.*/
        ArrayList<String> arrayPurchase = new ArrayList<>();
        arrayPurchase.add("Молоко");
        arrayPurchase.add("Кефир");
        arrayPurchase.add("Хлеб");
        arrayPurchase.add("Шоколад");
        arrayPurchase.add("Йогурт");

        for (String ap : arrayPurchase) {
            System.out.println(ap);
        }

        arrayPurchase.remove("Шоколад");

        for (String ap : arrayPurchase) {
            System.out.println(ap);
        }
    }
}
