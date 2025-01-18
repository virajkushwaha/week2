public class BookDetails {
    String title, author;
    int price;
    //Default constructor
    BookDetails() {
        System.out.println("Default constructor");
    }
    // Constructor to initialize book details
    BookDetails(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price);
    }
}
