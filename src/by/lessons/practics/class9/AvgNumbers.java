package by.lessons.practics.class9;

import java.io.IOException;
import java.util.List;

public class AvgNumbers extends Thread {
    /*1. Создать 5 потоков, каждый из которых вычисляет
    среднее арифметическое коллекции из
    5 случайных целых чисел и выводит на экран. Потоки решать двумя способоами
    через класс Thread и интерфейс Runnable*/
    List<Integer> numbers;

    public AvgNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void avg() {
        int sum = 0;
        String str = Thread.currentThread().getName();
        System.out.println("Поток " + str + " стартовал");
        for (Integer i : numbers) {
            try {
                System.out.println("Поток " + str + " работает");
                Thread.sleep(1000);
                sum += i;
            } catch (InterruptedException e) {
                throw new RuntimeException("ERROR");
            }
        }
        System.out.println("Поток "+str+" закончил с результатом "+sum / numbers.size());
    }

    @Override
    public void run() {
        avg();

    }
}
