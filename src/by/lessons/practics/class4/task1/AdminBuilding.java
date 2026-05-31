package by.lessons.practics.class4.task1;

public class AdminBuilding extends CivilBuilding {
    /*1.4 Создать класс Административном здание.
    Административное здание должно наследоваться от Гражданского здания.
    Поля, которые можно определить в Административном здании:
    назначение административного здания (офисное, кинотеатр, спортсооружение),число людей,
    на которое рассчитано здание.*/
    private String purpose;
    private int numberOfPeople;

    public AdminBuilding(String street, String wallMaterial, int year, String appointment, int floors, String purpose, int numberOfPeople) {
        super(street, wallMaterial, year, appointment, floors);
        this.purpose = purpose;
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String toString(){
        String info = super.toString();
        info = info + "\nНазначение административного здания: " + purpose + "\nЧисло людей: " + numberOfPeople;
        return info;
    }
}
