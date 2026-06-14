package by.lessons.practics.class6;

public class Page {
    /*5.1 Создать Класс Page страница. У страницы есть номер страницы, тип бумаги.*/
    private int pageNumber;
    private String type;

    public Page(int pageNumber, String type) {
        this.pageNumber = pageNumber;
        this.type = type;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String info = " Количество страниц " + pageNumber + " Тип бумаги " + type;
        return info;
    }
}
