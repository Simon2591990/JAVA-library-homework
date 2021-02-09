
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int bookCapacity;

    public Library(){
        this.bookCollection = new ArrayList<Book>();
        this.bookCapacity = 10;
    }

    public int getNumberOfBooks() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        this.bookCollection.add(book);
    }

    public int getBookCapacity() {
        return this.bookCapacity;
    }
}
