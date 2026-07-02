package by.lessons.practics.class9;

import java.util.List;

public class MainNumber {
    public static void main(String[] args) {
       List<Integer> numbers1 = List.of(1,6,9,4,7);
//       AvgNumbers number1 = new AvgNumbers(numbers1);
//        number1.setName("One");
        List<Integer> numbers2 = List.of(2,6,10,4,6);
//        AvgNumbers number2 = new AvgNumbers(numbers2);
//        number2.setName("Two");
//        List<Integer> numbers3 = List.of(1,7,9,8,7);
//        AvgNumbers number3 = new AvgNumbers(numbers3);
//        number3.setName("Three");
//        List<Integer> numbers4 = List.of(9,6,9,3,7);
//        AvgNumbers number4 = new AvgNumbers(numbers4);
//        number4.setName("Four");
//        List<Integer> numbers5 = List.of(1,9,9,9,7);
//        AvgNumbers number5 = new AvgNumbers(numbers5);
//        number5.setName("Five");
//        number1.start();
//        number2.start();
//        number3.start();
//        number4.start();
//        number5.start();

        AvgWithRunnable avg1 = new AvgWithRunnable(numbers1);
        Thread t1 = new Thread(avg1);

        AvgWithRunnable avg2 = new AvgWithRunnable(numbers2);
        Thread t2 = new Thread(avg2);

        t1.start();
        t2.start();
    }
}
