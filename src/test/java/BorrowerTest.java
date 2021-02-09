import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book;
    private Book book2;

    @Before
    public void before(){
        borrower = new Borrower("Simon");
        library = new Library();
        book = new Book("Harry Potter", "JK Rowling", "fantasy");
        book2 = new Book("Charlotte's Web", "E.B. White", "childrens");
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
        library.addBook(book);
        borrower.borrowBook(book, library);
        assertEquals(1, borrower.getNumberOfBorrowedBooks());
        assertEquals(0, library.getNumberOfBooks());
    }
    @Test
    public void canAddToGenresArray(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book2);
        borrower.borrowBook(book, library);
        assertEquals(2, library.getNumberOfBooksOfGenre("fantasy"));


    }

}
