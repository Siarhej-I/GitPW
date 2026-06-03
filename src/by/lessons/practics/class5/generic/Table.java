package by.lessons.practics.class5.generic;

/*5. Создать класс стол. Этот класс будет состоять из двух дженериков.
Первый дженерик будет отображать инвертарный номер стола(Integer),
второй дженерик будет отображать персонажа, который за ним будет сидеть*/
public class Table<I extends Integer, W extends Man> {
    private I iNumber;
    private W who;

    public Table(I iNumber, W who) {
        this.iNumber = iNumber;
        this.who = who;
    }

    public I getiNumber() {
        return iNumber;
    }

    /*6. Реализовать метод в классе стол, который будет выводить имя персонажа, который сидит за столом.*/
    public String getNameGen(){
        String nameOut = who.getName();
        return nameOut;
    }
}
