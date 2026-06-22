package by.lessons.practics.class7.task2;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    /*2. Создать класс UserRepository. Внутри класса создать статическую переменную List<User> users.*/
    public static List<User> users;

    /*3. Выполнить инициаизацию коллекции в статическом блоке. Создать 5 пользователей и заполнить поля.*/
    static {
        users = new ArrayList<>();
        users.add(new User("vasya", "qwerty", "vasya", "vasnetsov"));
        users.add(new User("petya", "123456", "petya", "avramov"));
        users.add(new User("zhenya", "ytrewq", "zhenya", "ustinova"));
        users.add(new User("kseniya", "654321", "kseniya", "petrova"));
        users.add(new User("katya", "12qwaszx", "katya", "ivanova"));
    }
}
