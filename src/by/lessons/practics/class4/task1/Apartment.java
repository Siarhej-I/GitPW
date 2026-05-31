package by.lessons.practics.class4.task1;

public class Apartment extends CivilBuilding {
    /*1.5 Создать класс Многоквартирный жилой дом.
    Вопрос: От какого класса должен наследоваться Многоквартирный жилой дом.
    Поля, которые можно определить в Многоквартирном жилье: количество квартир.*/
    private int countOfApartment;

    public Apartment(String street, String wallMaterial, int year, String appointment, int floors, int countOfApartment) {
        super(street, wallMaterial, year, appointment, floors);
        this.countOfApartment = countOfApartment;
    }

    public String toString(){
        String info = super.toString();
        info = info + "\nКоличество квартир: " + countOfApartment;
        return info;
    }
}
