public class MovieTicketDetail {
    String movieName;
    int seatNumber;
    int price;

    public MovieTicketDetail(String movieName, int seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket, assigns a seat and updates price
    public void bookTicket(int seatNumber, int price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display the ticket details
    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: $" + price);
    }

}
