package by.lessons.practics.class7.task1;

import java.util.*;

public class MainHashMap {
    public static void main(String[] args) {
        /*1. Заполнить HashMap 10 объектами <Integer, String>.
        Найти строки у которых ключ>5  вывести строки через запятую.
        1.1 Перемножить все ключи, у которых соответствующая строка состоит из более чем 5 элементов.*/
        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(1, "one");
        newMap.put(2, "two");
        newMap.put(3, "three");
        newMap.put(4, "four");
        newMap.put(5, "five");
        newMap.put(6, "six");
        newMap.put(7, "seven");
        newMap.put(8, "eight");
        newMap.put(9, "nine");
        newMap.put(10, "ten");

        System.out.println(withMap(newMap, 5));
        System.out.println("------------------------------------");
        System.out.println(intMap(newMap));
    }

    private static List<String> withMap(Map<Integer, String> map, int find) {
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        List<String> tempMap = new ArrayList<>();
        for (Map.Entry<Integer, String> node : entries) {
            if (node.getKey() > find) {
                tempMap.add(node.getValue());
            }
        }
        return tempMap;
    }

    private static Integer intMap(Map<Integer, String> map) {
        Set<Integer> keyList = map.keySet();
        int key = 1;
        for (Integer i : keyList) {
            String tempStr = map.get(i);
            if (tempStr.length() > 4) {
                key *= i;
            }
        }
        return key;
    }
}
