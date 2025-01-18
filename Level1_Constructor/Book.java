public class Book {
    public static void main(String[] args) {
        // Create a BookDetails object and display book information
        BookDetails book = new BookDetails("Let Us C", "Jaswant", 300);
        BookDetails book1 = new BookDetails();
        book.display();
        book1.display();
    }
}
