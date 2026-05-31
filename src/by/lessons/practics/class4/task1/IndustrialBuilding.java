package by.lessons.practics.class4.task1;

public class IndustrialBuilding extends Building {
    /*1.3 Создать класс Промышленном здание (IndustrialBuilding).
    Промышленные здания наследуются от Постройки.
    Поля которые можно определить в Промышленном здании: отрасль (Отрасль в которой здание задействовано
    (машиностроительная, легкая промышленность, целлюлозная промышленность, сельское хозяйство)*/
    private String industry;

    public IndustrialBuilding(String street, String wallMaterial, int year, String industry) {
        super(street, wallMaterial, year);
        this.industry = industry;
    }

    public String toString(){
        String info = super.toString();
        info = info + "\nОтрасль: " + industry;
        return info;
    }
}
