

public class BookDetails1 {
    //attributes title, author, price, and availability
    String title;
    String author;
    int price;
    boolean availability;

    //getter and setter methods
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    // Constructor to initialize book details
    //parametrized constructor
    public BookDetails1(String title, String author, int price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    //default constructor
    public BookDetails1() {
        System.out.println("Default constructor");
    }
    //copy constructor
    public BookDetails1(BookDetails1 book1) {
        this.title = book1.title;
        this.author = book1.author;
        this.price = book1.price;
        this.availability = book1.availability;
    }

    //borrow method
    public void borrow() {
        if (availability) {
            System.out.println("Book borrowed successfully");
            availability = false;
        } else {
            System.out.println("Book not available");
        }
    }
    //display method
    public void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nAvailability: " + availability);
    }
}
