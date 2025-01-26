package Day6_Polymorphism.problemStatement.LibraryManagement;

// Subclass - Book
public class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    // Constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Override abstract method to define loan duration
    @Override
    public int getLoanDuration() {
        return 14; // Loan duration for a book is 14 days
    }

    // Reservable methods
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The book \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The book \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
