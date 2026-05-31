package by.lessons.practics.class4.task2;

public class Student {
    /*1.1 Определить поля в классе Student: возраст (тип int), идентификационный номер (тип long),
    успеваемость (тип short), имя (тип String), фамилия (тип String). Создать конструктор со всеми параметрами класса.
    Создать конструктор без параметров.*/

    private long id;
    private int age;
    private short grade;
    private String name;
    private String surname;

    public Student() {
    }

    public Student(long id, int age, short grade, String name, String surname) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        String info = "";
        info = "идентификационный номер: " + id + " |" + "возраст: " + age + " |" + "успеваемость: " + grade + " |" +
                "имя: " + name + " |" + "фамилия: " + surname;
        return info;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student stud = (Student) obj;
        if ((this.id == ((Student) obj).id) && (this.age == ((Student) obj).age) &&
                (this.grade == ((Student) obj).grade) && (this.name.equals(((Student) obj).name)) &&
                (this.surname.equals(((Student) obj).surname))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hash = (int) (this.id + this.age * 2 + this.grade * 3 + this.name.hashCode() + this.surname.hashCode());
        return hash;
    }
}
