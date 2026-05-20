package by.lessons.practics.class3;

public class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book(1, "Interest", "Bob", "Home", 2023, 100, 30);

        System.out.println("Объект конструктора без параметров: \n" + book1.info());
        System.out.println("-----------------------------------------------------");
        System.out.println("Объект конструктора c параметрами: \n" + book2.info());
        System.out.println("---------------------changePrice-------------------------");

        book1.changePrice(21);
        System.out.println("Измененная цена " + book1.price);
        System.out.println("---------------------getBooks--------------------------");

        for (Book b : book1.getBooks(arrayBook(), 2021)) {
            if (b == null) {
                continue;
            }
            System.out.println(b.info());
        }

        System.out.println("-----------------------removeBook-------------------------");

        for (Book b : book1.removeBook(arrayBook(), 3)) {
            if (b == null) {
                continue;
            }
            System.out.println(b.info());
        }
    }

    /*4 В классе main создать массив из пяти книг*/
    public static Book[] arrayBook() {
        Book[] books = new Book[5];

        books[0] = new Book(1, "Interest", "Bob", "Home", 2023, 100, 30);
        books[1] = new Book(2, "Asol", "Bill", "Work", 2021, 123, 20);
        books[2] = new Book(3, "Seaman", "Andru", "Work", 2026, 150, 50);
        books[3] = new Book(4, "Ironman", "John", "Home", 2020, 110, 43);
        books[4] = new Book(5, "Old book", "Jack", "Home", 2019, 200, 72);

        return books;
    }
}
