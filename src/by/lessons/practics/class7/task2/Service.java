package by.lessons.practics.class7.task2;

import java.util.ArrayList;
import java.util.List;

public class Service {
    /*4. Создать класс сервис.
    Реализовать в этом классе метод аутенфикации  пользователя (void authenticate (String login, String password).
    Этот метод должен проверять наличие пользователя в репозитории по логину.
    Если пользователя нет, то выбрасываем собственное исключение (UserNotFoundException)

    5. В этом же методе выполнить проверку пароля пользователя, если по логину мы его нашли.
    Если пароль не совпадает, то выбрасываем собственное исключение NotCorrectPasswordException.*/

    public void authenticate(String login, String password) throws NotCorrectPasswordException {
        List<User> users = UserRepository.users;
        List<String> logins = new ArrayList<>();
        List<String> passwords = new ArrayList<>();
        for (User l : users) {
            logins.add(l.getLogin());
        }
        for (User p : users) {
            passwords.add(p.getPassword());
        }
//        if (!(logins.contains(login))) {
//            throw new UserNotFoundException();
//        } else if (logins.contains(login) && (!(passwords.contains(password)))){
//            throw new NotCorrectPasswordException();
//        }

    }
}
