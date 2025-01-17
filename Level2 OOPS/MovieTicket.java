public class MovieTicket {
    // Main method to demonstrate ticket booking
    public static void main(String[] args) {
        // Creating a new MovieTicket object
        MovieTicketDetail ticket = new MovieTicketDetail("Avengers: Endgame",20 , 150);

        // Displaying ticket details before booking
        System.out.println("Ticket Details before booking:");
        ticket.displayTicketDetails();

        // Booking the ticket with updated seat and price
        ticket.bookTicket(14, 180);

        // Displaying ticket details after booking
        System.out.println("\nTicket Details after booking:");
        ticket.displayTicketDetails();
    }
}
