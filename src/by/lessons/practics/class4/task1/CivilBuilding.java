package by.lessons.practics.class4.task1;

public class CivilBuilding extends Building {
    /*1.2 Создать класс Гражданские здания (CivilBuilding).
    Гражданские здания должны наследоваться от класса Постройка.
    Поля у класса Гражданские здания: назначение (жилье или общественные здания), количество этажей.*/

    private String appointment;
    private int floors;

    public CivilBuilding(String street, String wallMaterial, int year, String appointment, int floors){
        super(street, wallMaterial, year);
        this.appointment = appointment;
        this.floors = floors;
    }

    public String toString(){
        String info = super.toString();
        info = info + "\nНазначение гражданского здания: " + appointment + "\nКоличество этажей: " + floors;
        return info;
    }
}
