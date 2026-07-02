package by.lessons.practics.class10.task2;

public class Auto {
    /*1. Создать класс авто. Поля: id, марка, пробег, год выпуска, максимальная скорость, цена.*/
    private int id;
    private String mark;
    private int mile;
    private int year;
    private int speed;
    private int price;

    public Auto(int id, String mark, int mile, int year, int speed, int price) {
        this.id = id;
        this.mark = mark;
        this.mile = mile;
        this.year = year;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto|id=" + id + ", mark='" + mark + ", mile=" + mile + ", year=" + year +
                ", speed=" + speed + ", price=" + price + '|';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
