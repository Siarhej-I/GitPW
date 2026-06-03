package by.lessons.practics.class5.implement;

public class VacuumCleaner implements Electrical {
    /*6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn.
    Класс Пылесос имплементирует интерфейс Электроприборы.
    Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».*/

    private String name;
    private String brend;
    private int price;
    private boolean isOn;

    public VacuumCleaner(String name, String brend, int price, boolean isOn) {
        this.name = name;
        this.brend = brend;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Пылесос " + this.name + " убирает");
    }

    public void clean() {
        System.out.println("пылесосит");
    }
}
