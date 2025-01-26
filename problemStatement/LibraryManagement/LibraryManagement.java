package Day6_Polymorphism.problemStatement.LibraryManagement;

public class LibraryManagement {
    public static void main(String[] args) {
        // Creating different library items
        LibraryItem book = new Book("B001", "The Alchemist", "Paulo Coelho");
        LibraryItem magazine = new Magazine("M001", "National Geographic", "Various Authors");
        LibraryItem dvd = new DVD("D001", "Inception", "Christopher Nolan");

        // Polymorphism: Managing items with a general LibraryItem reference
        LibraryItem[] items = { book, magazine, dvd };

        // Display item details and loan durations
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println();
        }

        // Reserving items and checking availability
        Reservable reservableBook = (Reservable) book;
        Reservable reservableMagazine = (Reservable) magazine;
        Reservable reservableDvd = (Reservable) dvd;

        reservableBook.reserveItem();
        reservableMagazine.reserveItem();
        reservableDvd.reserveItem();

        System.out.println("\nAvailability:");
        System.out.println("Book available: " + reservableBook.checkAvailability());
        System.out.println("Magazine available: " + reservableMagazine.checkAvailability());
        System.out.println("DVD available: " + reservableDvd.checkAvailability());
    }
}
