package by.lessons.practics.class4.task1;

public class Factory extends IndustrialBuilding {
    /*1.6 Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика.
    Поля, которые можно определить в Фабрике: количество работников,
    выпускаемая продукция (запчасти, полиэтилен и т.д.) */

    private int numOfEmployee;
    private String product;

    public Factory(String street, String wallMaterial, int year, String industry, int numOfEmployee, String product) {
        super(street, wallMaterial, year, industry);
        this.numOfEmployee = numOfEmployee;
        this.product = product;
    }

    public String toString(){
        String info = super.toString();
        info = info + "\nКоличество работников: " + numOfEmployee + "\nВыпускаемая продукция: " + product;
        return info;
    }
}
