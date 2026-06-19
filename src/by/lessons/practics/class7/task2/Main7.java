package by.lessons.practics.class7.task2;

public class Main7 {
    public static void main(String[] args) {
        /*6. В классе main при вызове метода аутенфикации перехватите исключение UserNotFoundException
        и выведите в консоль (нет пользователя)
        7. Также перехватите оставшиеся исключения и в блоке catch выведите в консоль сообщение
        (Вы не прошли аутенфикацию)*/
        Service service = new Service();
        try {
            service.authenticate("vasya1", "qwerty1");
        } catch (UserNotFoundException u) {
            System.out.println("Нет такого пользователя!");
            throw new UserNotFoundException();
        } catch (NotCorrectPasswordException u){
            System.out.println("Неверный пароль!");
            throw new NotCorrectPasswordException();
        }

    }
}
