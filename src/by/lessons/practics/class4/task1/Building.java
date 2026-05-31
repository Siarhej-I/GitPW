package by.lessons.practics.class4.task1;

public class Building {
    /*1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.*/
    private String street;
    private String wallMaterial;
    private int year;

    public Building(String street, String wallMaterial, int year) {
        this.street = street;
        this.wallMaterial = wallMaterial;
        this.year = year;
    }

    public String toString(){
        String info = super.toString();
        info = info + "\nУлица: " + street + "\nМатериал стен: " + wallMaterial + "\nГод постройки: " + year;
        return info;
    }
}
