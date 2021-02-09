import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Harry Potter", "JK Rowling", "fantasy");

    }
    @Test
    public void bookCollectionStartsAtZero(){
        assertEquals(0, library.getNumberOfBooks());
    }
    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.getNumberOfBooks());
    }




}
