package OOP_WEEK_6.TASK8_LIBRARY;

public class Book {

    private String title;

    private String publisher;

    private int publishingYear;

    public Book(String title, String publisher, int publishingYear){
        this.title=title;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
    }

    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public int year() {
        return publishingYear;
    }

    public String toString(){
        return this.title + ", " + this.publisher() + ", " + this.publishingYear;

    }
}
