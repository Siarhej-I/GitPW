package by.lessons.practics.class5.generic;

/*1. Создать класс Персонаж. Поля Имя, фамилия.*/
public class Character implements Man {
    private String name;
    private String surname;

    public Character(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        String gName = this.name + " " + this.surname;
        return gName;
    }
}
