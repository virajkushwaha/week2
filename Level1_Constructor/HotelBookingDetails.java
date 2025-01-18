

public class HotelBookingDetails {
    // attributes guestName, roomType, and nights
    String guestName;
    String roomType;
    int nights;
    // Constructor to initialize hotel booking details
    //parametrized constructor
    HotelBookingDetails(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    //default constructor

    HotelBookingDetails() {
        System.out.println("Default constructor");
    }
    //copy constructor
    HotelBookingDetails(HotelBookingDetails hotelBookingDetails) {
        this.guestName = hotelBookingDetails.guestName;
        this.roomType = hotelBookingDetails.roomType;
        this.nights = hotelBookingDetails.nights;
    }
    // Display hotel booking details

    void display() {
        System.out.println("Guest Name: " + guestName + "\nRoom Type: " + roomType + "\nNumber of Nights: " + nights);
    }
    
}
