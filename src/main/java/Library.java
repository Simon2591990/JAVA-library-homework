
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> bookCollection;
    private int bookCapacity;
    private HashMap<String, Integer> genres;

    public Library(){
        this.bookCollection = new ArrayList<Book>();
        this.bookCapacity = 5;
        this.genres = new HashMap<String, Integer>();
    }

    public int getNumberOfBooks() {
        return this.bookCollection.size();
    }

    public void addBook(Book book) {
        if (this.bookCollection.size() < this.bookCapacity){
        this.bookCollection.add(book);
        this.genres.merge(book.getGenre(), 1, Integer::sum);
            System.out.println(genres);




    }
    }
    public int getBookCapacity() {
        return this.bookCapacity;
    }

    public void removeBook(Book book) {
        this.bookCollection.remove(book);
    }
}
