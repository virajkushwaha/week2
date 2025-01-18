

public class HotelBooking {
    public static void main(String[] args) {
        //Calling parameterized constructor
    HotelBookingDetails booking1 = new HotelBookingDetails("John", "Deluxe", 3);
    HotelBookingDetails booking2 = new HotelBookingDetails("Sam", "Standard", 2);
    HotelBookingDetails booking3 = new HotelBookingDetails("Kancha", "Suite", 4);
    //Calling copy constructor
    HotelBookingDetails booking4 = new HotelBookingDetails(booking1);
    //Calling default constructor
    HotelBookingDetails booking5 = new HotelBookingDetails();
    //Displaying hotel booking details by calling all the constructors
    booking1.display();
    booking2.display();
    booking3.display();
    booking4.display();
    booking5.display();
    }

}
