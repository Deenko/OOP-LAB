package OOP_WEEK_7.TASK2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        List<Book> bookList = new ArrayList<>();
            bookList = Arrays.asList(
                    new Book("Jezeva", "Branko Copic", 1944, true),
                    new Book("Gospodar", "J.R.R. Tolkien", 1955, false),
                 new Book("Discrete Mathematics & its Applications", "Kenneth H. Rosen", 2019, true));



            LibraryCatalog libraryCatalog = new LibraryCatalog(bookList);

        Optional<Book> jezevaKucica = libraryCatalog.checkAvailability("Jezeva Kucica");
        System.out.println("BOOK: Jezeva Kucica \nAvailability : " + jezevaKucica.isPresent());

        System.out.println();

        Optional<Book> JRRTOLKIEN = libraryCatalog.getFirstAvailableBookByAuthor("J.R.R. Tolkien");
        System.out.println("Searching by author 'J.R.R Tolien' ... \n" + JRRTOLKIEN.orElse(null));


        libraryCatalog.updateAvailability("Gospodar", true);


        libraryCatalog.books.forEach(book -> System.out.println("\n"+ book.title() + "" + "\nAvailable: " + book.availability()));
    }
}
