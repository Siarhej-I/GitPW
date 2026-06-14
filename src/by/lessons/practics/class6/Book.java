package by.lessons.practics.class6;

import java.util.Objects;

public class Book {
    /*3. Условие: Создай класс Book с полями:
• String title
• String author*/

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /*3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false*/
    /*Переопределите методы equals() и hashCode() так, чтобы книги с разными значениями title и
        author считались одинаковыми.*/
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book)) {
            return true;
        }
        Book book = (Book) o;
        if (title.equals(((Book) o).getTitle()) && (author.equals(book.author))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return 1000;//title.length() + author.length();
    }

    @Override
    public String toString() {
        return "Описание: " + title + " Автор: " + author;
    }
}
