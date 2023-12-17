package OOP_WEEK_7.TASK2;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibraryCatalog {


    List<Book> books;

        public LibraryCatalog(List<Book> books){
        this.books = books;

        }


        public Optional<Book> checkAvailability(String bookName){
            return books.stream()
                    .filter(book -> book.title().equals(bookName))
                    .findFirst()
                    .filter(book -> book.availability());
        }


        public Optional<Book> getFirstAvailableBookByAuthor(String authorName){
            return books.stream()
                    .filter(book -> book.author().equals(authorName))
                    .findFirst();
        }



    public void updateAvailability(String title, boolean available) {
        books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst()
                .ifPresent(book -> book = new Book(
                        book.title(), book.author(), book.publishYear(), available
                ));
    }
}
