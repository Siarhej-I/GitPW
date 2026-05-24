package by.lessons.practics.class3;

public class Book {
    /*1 Создать класс Book c полями id (тип int), name (тип String), author (тип String), издательство ( тип String ),
    Год издания(тип Int), Количество страниц (тип int), цена (double).
    Инициализацию книги в классе main выполнять через конструктор с параметрами.
    Также определите конструктор без параметров. */
    int id;
    String name;
    String author;
    String publish;
    int year;
    int quantity;
    double price;

    public Book() {

    }

    public Book(int id, String name, String author, String publish, int year, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.quantity = quantity;
        this.price = price;
    }

    /*2 Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info*/
    public String info() {
        String info = "№ " + this.id +
                "\nНазвание: " + this.name +
                "\nАвтор: " + this.author +
                "\nИздательство: " + this.publish +
                "\nГод издания: " + this.year +
                "\nКоличество страниц: " + this.quantity +
                "\nЦена: " + this.price;
        return info;
    }

    /*3 Создать метод, который будет изменять цену книги (сам метод в качестве параметра будет принимать новую цену)*/
    public void changePrice(double price) {
        this.price = price;
    }

    /*5 Создать метод в классе Book, который будет принимать массив книг и возвращать массив книг,
    у которых год издания ниже переданного года в методе.*/
    public Book[] getBooks(Book[] books, int inYear) {
        Book[] getBooks = new Book[5];
        int i = 0;
        for (Book b : books) {
            if (b.year < inYear) {
                getBooks[i] = b;
                i++;
            }
        }
        return getBooks;
    }

    /*6 Создайте метод, который будет принимать массив книг идентификатор (id)книги,
    которую надо удалить из этого массива. Сам метод будет возвращать массив книг.
    Сигнатура метода: public Book[]removeBook(Book[]books, int id)*/

    public Book[] removeBook(Book[] books, int id) {
        Book[] removeBook = new Book[books.length - 1];
        int i=0;
        for (Book b : books) {
            if (b.id != id) {
                removeBook[i] = b;
                i++;
            }
        }
        return removeBook;
    }
}
