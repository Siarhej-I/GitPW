package by.lessons.practics.class5.generic;

/*2. Создать класс Студент. Поля факультет */
public class Student implements Man {
    private String faculty;

    public Student(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName().toUpperCase() + " " + this.faculty;
    }
}
