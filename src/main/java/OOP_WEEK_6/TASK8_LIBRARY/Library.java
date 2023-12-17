package OOP_WEEK_6.TASK8_LIBRARY;

import java.util.ArrayList;
import java.util.List;

public class Library {

    ArrayList<Book> library = new ArrayList<>();
    public Library(){

    }

    public void addBook(Book book){
        library.add(book);
    }

    public void printBooks(){
        for (Book book : library){
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : library ){
            if (StrilUtils.included(book.title(), title)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> getBookByAuthor(String authorName) {

            ArrayList<Book> found = new ArrayList<>();
            for (Book book : library) {
                if (StrilUtils.included(book.publisher(), authorName)) {
                    found.add(book);
                }
            }
        return found;
    }

    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<>();
        for (Book book : library){
            if (book.year() == year){
                found.add(book);
            }
        }
        return found;
    }
}

