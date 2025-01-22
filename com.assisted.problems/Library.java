import java.util.ArrayList;

public class Library {
    // Instance Variables
    private String name;
    private ArrayList<Book> books;

    // Constructor to initialize Library details
    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    // Method to add books to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + name);
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.displayBookDetails();
            }
        }
    }
}
