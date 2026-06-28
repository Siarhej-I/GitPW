package by.lessons.practics.class8;

import java.io.Serializable;

public class Farm implements Serializable {
    String animalName;
    int age;

    public Farm(String animalName, int age) {
        this.animalName = animalName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "|На ферме есть " + animalName + " " + age + " лет|";
    }
}
