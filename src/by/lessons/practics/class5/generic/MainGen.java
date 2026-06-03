package by.lessons.practics.class5.generic;

public class MainGen {
    public static void main(String[] args) {
        /*7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.*/
        Character character1 = new Character("Никита", "Хрущев");
        Table<Integer, Character> ch1 = new Table<>(123, character1);
        Student student1 = new Student("ФКСИС");
        Table<Integer, Student> st1 = new Table<>(456, student1);
        Employee employee1 = new Employee(2987.12);
        Table<Integer, Employee> em1 = new Table<>(789, employee1);

        /*8. Вывести поочередно  имена персонажей, которые сидят за столом.*/
        Table<?, ?>[] tables = {ch1, st1, em1};
        for (Table<?, ?> t : tables) {
            System.out.print("\n За столом " + t.getiNumber() + " сидит " + t.getNameGen());
        }
    }
}
