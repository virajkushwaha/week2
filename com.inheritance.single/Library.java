class Book{
    private String title;
    private int publicationYear;

    //constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    //method display info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book{
    private String name;
    private String bio;
    //constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    //overriding the display method 
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author bio:" + bio);
    }
}

public class Library {
    public static void main(String[] args) {
        //creating an object of Author class
        Author author = new Author("Harry Potter", 2000, "J.K. Rowling",
        "J.K. Rowling is a British author, screenwriter, and philanthropist.");
        //calling the displayInfo method
        author.displayInfo();
        
    }
}
