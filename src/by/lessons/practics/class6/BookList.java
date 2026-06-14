package by.lessons.practics.class6;

import java.util.List;

public class BookList {
    /*5. Создайте класс Книга. Поля Название книги, Автор, Список Страниц List<Page> pages*/
    private String title;
    private String author;
    List<Page> pages;

    public BookList() {
    }

    public BookList(String title, String author, List<Page> pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
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

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    /*5.2 Реализуйте метод по удалению одной страницы из книги в классе Книга.*/
    public void removeOnePage() {
        for (Page p : pages) {
            p.setPageNumber(p.getPageNumber() - 1);
        }
    }

    @Override
    public String toString() {
        String info = "Название " + title + " Автор " + author + this.pages.toString();
        return info;
    }

    /*5.3 В классе книга реализуйте метод по подсчёту страниц типа пергамент*/
    public int countSpecialPage(String typePage) {
        int count = 0;
        for (Page p : pages) {
            if (p.getType().equals(typePage)) {
                count += p.getPageNumber();
            }
        }
        return count;
    }

    /*5.4 Отфильтруйте книги по Автору (Пушкин). Реализуйте метод по поиску книг по автору*/
    public BookList[] byAuthor(List<BookList> bl, String findAuthor) {
        int x = 0, y = 0;
        BookList[] arrBL = new BookList[bl.size()];
        for (BookList b : bl) {
            if (b.getAuthor().equals(findAuthor)) {
                arrBL[x] = b;
                x++;
            } else {
                arrBL[(bl.size() - 1) - y] = b;
                y++;
            }
        }
        return arrBL;
    }
}
