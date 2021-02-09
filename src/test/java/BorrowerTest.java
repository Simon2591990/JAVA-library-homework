import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("Simon");
        library = new Library();
        book = new Book("Harry Potter", "JK Rowling", "fantasy");

    }
    @Test
    public void hasName(){
        assertEquals("Simon", borrower.getName());
    }
    @Test
    public void borrowedBooksStartsAt0(){
        assertEquals(0, borrower.getNumberOfBorrowedBooks());
    }
    @Test
    public void canAddBook(){
        borrower.borrowBook(book, library);
        assertEquals(1, borrower.getNumberOfBorrowedBooks());



    }

}
