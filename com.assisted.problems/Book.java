public class Book {
    // Instance Variables
    private String title;
    private String author;

    // Constructor to initialize book details
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    
    // Instance method to display Book details
    public void displayBookDetails(){
        System.out.println("\nBook Details\n");
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);
    }

}
