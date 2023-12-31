import java.util.HashMap;
import java.util.Map;

public class LibraryData {
    
    private Map<String, User> users = new HashMap<>();
    private Map<String, Book> books = new HashMap<>();
    private Map<String, LoanBook> borrowings = new HashMap<>();

    // Methods to manipulate user maps

    public void addUser(String userId, User user) {
        users.put(userId, user);
    }

    public void removeUser(String userId) {
        users.remove(userId);
    }

    public Map<String, User> getUsers() {
        return users;
    }

    // Methods to manipulate book maps

    public void addBook(String bookId, Book book) {
        books.put(bookId, book);
    }

    public void removeBook(String bookId) {
        books.remove(bookId);
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    // Methods to manipulate loan maps

    public void addBorrowing(String bookId, LoanBook book) {
        borrowings.put(bookId, book);
    }

    public void removeBorrowing(String bookId) {
        borrowings.remove(bookId);
    }

    public Map<String, LoanBook> getBorrowings() {
        return borrowings;
    }

}
