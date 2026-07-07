package by.lessons.practics.class10;

public class Main10 {
    public static void main(String[] args) {
        /*2. В классе main используя ваш функциональный интерфейс,
        создате лямбда выражение и посчитайте произведение 5 на 10.*/
        Multiplication mult1 = (a1, a2) -> {
            return a1 * a2;
        };
        System.out.println("Умножение "+mult1.multiplication(5,10));
        Multiplication mult2 = (a1, a2) -> a1 / a2;
        System.out.println("Деление "+mult2.multiplication(9,3));
    }
}
