package by.lessons.practics.class5.implement;

/*1. Создать Интерфейс Электроприборы. В интерфейсе Электроприборы реализовать абстрактный метод:  work();*/
//2. Создать дефолтный метод в интерфейсе Электроприборы., start() который выводит текст «Электроприбор стартует».
public interface Electrical {
    void work();
    default void start(){
        System.out.println("Электроприбор стартует");
    }
}
