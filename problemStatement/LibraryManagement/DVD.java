package Day6_Polymorphism.problemStatement.LibraryManagement;


// Subclass - DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    // Constructor
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Override abstract method to define loan duration
    @Override
    public int getLoanDuration() {
        return 3; // Loan duration for a DVD is 3 days
    }

    // Reservable methods
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The DVD \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The DVD \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

