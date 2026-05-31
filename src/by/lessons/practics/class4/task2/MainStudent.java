package by.lessons.practics.class4.task2;

public class MainStudent {
    public static void main(String[] args) {
        /*1.2 В классе Main создать 3-ёх студентов. При этом значение полей у двух студентов должны быть одинаковыми.*/
        Student student1 = new Student(1L, 20, (short) 9, "Василий", "Васильев");
        Student student2 = new Student(1L, 20, (short) 9, "Василий", "Васильев");
        Student student3 = new Student(3L, 21, (short) 8, "Иван", "Иванов");

        /*1.3 Выполнить сравнение студентов вызвав метод equals и вывести результаты в консоль.*/
        System.out.println("student1 = student2 ? - " + student1.equals(student2));
        System.out.println("student1 = student3 ? - " + student1.equals(student3));

        /*1.4 Вызвать метод toString(). Результат вызова метода вывести в консоль.*/
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        /*1.5 Вызвать метод hashCode().*/
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());

        /*1.7 Повторить пункты 1.3, 1.4. Сравнить результаты.*/
    }
}
