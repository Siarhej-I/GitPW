package by.lessons.practics.class6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainBook {
    public static void main(String[] args) {
        /*3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();*/

        Book book1 = new Book("Первая", "Конан Дойл");
        Book book2 = new Book("Вторая", "Марк Твен");
        Book book3 = new Book("Третья", "Братья Стругацкие");

        List<Book> listBook = new ArrayList<>();

        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);

        for (Book b : listBook) {
            System.out.println(b);
        }
        System.out.println("-----------");
        /*3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.*/
        listBook.remove(book2);

        for (Book b : listBook) {
            System.out.println(b);
        }

        System.out.println("------------Set-----------------");
        /*Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты (одинаковое название и автор).
        Переопределите методы equals() и hashCode() так, чтобы книги с разными значениями title и
        author считались одинаковыми. Выведи содержимое множества и убедись, что дубликаты не добавляются.*/

        Book book4 = new Book("Третья", "Братья Стругацкие");

        Set<Book> setBook = new HashSet<>();
        setBook.add(book1);
        setBook.add(book2);
        setBook.add(book3);
        setBook.add(book4);

        for (Book sb : setBook) {
            System.out.println(sb);
        }
    }
}
