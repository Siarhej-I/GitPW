package by.lessons.practics.class9;

import java.util.List;

public class AvgWithRunnable implements Runnable {
    List<Integer> numbers;

    public AvgWithRunnable(List<Integer> numbers) {
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
