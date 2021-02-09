
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int bookCapacity;

    public Library(){
        this.bookCollection = new ArrayList<Book>();
        this.bookCapacity = 5;
    }

    public int getNumberOfBooks() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (this.bookCollection.size() < this.bookCapacity){
        this.bookCollection.add(book);
    }
    }
    public int getBookCapacity() {
        return this.bookCapacity;
    }

    public void removeBook(Book book) {
        this.bookCollection.remove(book);
    }
}
