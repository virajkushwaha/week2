package Day6_Polymorphism.problemStatement.LibraryManagement;

// Subclass - Magazine
public class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

    // Constructor
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Override abstract method to define loan duration
    @Override
    public int getLoanDuration() {
        return 7; // Loan duration for a magazine is 7 days
    }

    // Reservable methods
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The magazine \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The magazine \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
