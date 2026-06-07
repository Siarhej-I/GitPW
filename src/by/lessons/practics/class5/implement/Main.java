package by.lessons.practics.class5.implement;

public class Main {

    public static void main(String[] args) {

        /*7. В классе main cоздайте по паре объектов на основании вышесозданных классов.
        Создайте в классе main создайте выставку из электроприбров и продемонстрируйте способности каждого электроприбора*/

        System.out.println("-------------выставка электроприборов------------");
        CoffeeMachine cof1 = new CoffeeMachine("Horizont", "Кофе якобс", 1000, true);
        WashingMachine wash1 = new WashingMachine("Home", "Elecrolux", 1200, false);
        VacuumCleaner vac1 = new VacuumCleaner("Building", "Samsung", 1500, false);
        Fridge fr1 = new Fridge("LG", "12345", 1300, true);

        Electrical[] vistavka = {cof1, wash1, vac1, fr1};

        for (Electrical e : vistavka) {
            e.work();
        }

        /*9.  В классе main сделать выставку только из Кухонной техники.
        Продемонстрировать спосбоности всех электроприборов в этой выставке.*/
        System.out.println("-------------выставка кухонной техники------------");
        Kitchen[] kitchens = {wash1, fr1};

        for (Kitchen k : kitchens) {
            k.work();
        }

        /*10. В классе main сделать выставку кофемашин. Продемонстрировать способности всех кофе машин.*/
        System.out.println("-------------выставка кофемашин------------");
        CoffeeMachine cof2 = new CoffeeMachine("Vityaz", "Без кофеина", 900, true);
        CoffeeMachine cof3 = new CoffeeMachine("Delonge", "Цикорий", 700, false);

        CoffeeMachine[] coffeeMachines = {cof1, cof2, cof3};

        for (CoffeeMachine c : coffeeMachines) {
            c.work();
        }

        /*11. На любой кофемашине вызовете метод start().
        После этого переопределите метод start так, чтобы этот метод включал прибор (менял значение Boolean isOn на true.)
        Выведите результат в консоль*/
        System.out.println("-------------включение прибора------------");
        System.out.println("Состояние электроприбора: " + cof3.isOn());
        cof3.start();
        System.out.println("Состояние электроприбора: " + cof3.isOn());
    }
}
