package by.lessons.practics.class5.generic;

/*3. Создать класс Сотрудник. Поля, зарплата*/
public class Employee implements Man {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName().toLowerCase() + " с зп " + this.salary;
    }
}
