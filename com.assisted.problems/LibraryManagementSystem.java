public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create some Book objects
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create some Library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");

        // Add books to the libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);

        // Display the books in each library
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}
