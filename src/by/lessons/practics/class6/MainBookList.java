package by.lessons.practics.class6;

import java.util.ArrayList;
import java.util.List;

public class MainBookList {
    public static void main(String[] args) {
        List<Page> pageList = new ArrayList<>();

        pageList.add(new Page(102, "Папирус"));
        pageList.add(new Page(132, "Пергамент"));
        pageList.add(new Page(99, "Пергамент"));

        BookList bookList1 = new BookList("Горе от ума", "Гоголь", pageList);
        BookList bookList2 = new BookList("Отцы и дети", "Достоевский", pageList);
        BookList bookList3 = new BookList("Муму", "Тургенев", pageList);
        BookList bookList4 = new BookList("Изгнание", "Солженицын", pageList);
        BookList bookList5 = new BookList("Ангелы и демоны", "Браун", pageList);

        System.out.println("---------5.2--------");
        System.out.println(bookList1);
        bookList1.removeOnePage();
        System.out.println(bookList1);

        System.out.println("---------5.3-------");
        System.out.println(bookList3.countSpecialPage("Пергамент"));

        /*5.4 Отфильтруйте книги по Автору (Пушкин). Реализуйте метод по поиску книг по автору*/
        System.out.println("---------5.4--------");
        List<BookList> bookLists = new ArrayList<>();
        bookLists.add(bookList5);
        bookLists.add(bookList3);
        bookLists.add(bookList2);
        bookLists.add(bookList1);
        bookLists.add(bookList4);
        bookLists.add(bookList1);
        bookLists.add(bookList1);

        BookList objBK = new BookList();
        for (BookList b : objBK.byAuthor(bookLists, "Гоголь")) {
            System.out.println(b.toString());
        }

    }
}
