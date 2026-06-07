package by.lessons.practics.class5.implement;

public class WashingMachine implements Kitchen {
    /*5. Создать класс Стиральная машина.
    Поля наименование, бренд, стоимость, Boolean isOn.
    Класс стиральная машина имплементирует интерфейс Электроприборы.
    Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».*/

    private String name;
    private String brend;
    private int price;
    private boolean isOn;

    public WashingMachine(String name, String brend, int price, boolean isOn) {
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Стиральная машина " + this.name + " стирает");
    }

    @Override
    public void gotovit() {
        System.out.println("Готовит бельё");
    }
}
