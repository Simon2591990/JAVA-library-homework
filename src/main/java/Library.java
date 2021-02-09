import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;

    public Library(){
        this.bookCollection = new ArrayList<Book>();
    }

    public int getNumberOfBooks() {
        return this.bookCollection.size();
    }
}
