// Book class with specified attributes and methods
class Book3 {
    public String ISBN; // Public attribute
    protected String title; // Protected attribute
    private String author; // Private attribute

    // Constructor to initialize Book
    public Book3(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for author (private attribute)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author (private attribute)
    public String getAuthor() {
        return this.author;
    }

    // Display method for Book details
    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass EBook extending Book
class EBook extends Book3 {
    private double fileSize; // Additional attribute specific to EBook

    // Constructor for EBook
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }
   // Display EBook details
   public void displayEBook() {
    System.out.println("EBook Details:");
    System.out.println("ISBN: " + ISBN); // Accessing public member
    System.out.println("Title: " + title); // Accessing protected member
    System.out.println("File Size: " + fileSize + " MB");
}
}