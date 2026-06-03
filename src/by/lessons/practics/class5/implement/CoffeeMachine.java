package by.lessons.practics.class5.implement;

public class CoffeeMachine implements Electrical {
    /*3. Создать класс Кофемашина. Поля наименование. Список функционала.
    Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы.
    Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».*/

    private String name;
    private String listFunc;
    private int price;
    private boolean isOn;

    public CoffeeMachine(String name, String listFunc, int price, boolean isOn) {
        this.name = name;
        this.listFunc = listFunc;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Кофемашина " + this.name + " варит кофе " + this.listFunc);
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Кофемашина выключена");
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void start() {
        System.out.println("Кофемашина стартует");
        this.isOn = true;
    }
}
