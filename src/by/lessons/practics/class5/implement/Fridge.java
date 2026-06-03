package by.lessons.practics.class5.implement;

public class Fridge implements Kitchen {
    /*4. Создать класс Холодильник.
    Поля: наименование, марка, стоимость, Boolean isOn (включен).
    Класс холодильник имплементирует интерфейс Электроприборы.
    Переопределите метод work так, чтобы методы выводил «Холодильник морозит».*/

    private String name;
    private String mark;
    private int price;
    private boolean isOn;

    public Fridge(String name, String mark, int price, boolean isOn) {
        this.name = name;
        this.mark = mark;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Холодильник " + this.name + " морозит");
    }

    @Override
    public void gotovit() {
        System.out.println("Готовит лёд");
    }
}
