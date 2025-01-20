

public class Vehicle {
     //Static Variable registrationFee
     static int registrationFee = 1500;
    
     final String REGISTRATION_NUMBER;
     String ownerName ;
     String vehicleType ;
 
 
     Vehicle(String ownerName, String REGISTRATION_NUMBER ,String vehicleType){
         this.ownerName = ownerName;
         this.REGISTRATION_NUMBER = REGISTRATION_NUMBER;
         this.vehicleType = vehicleType;
        
     }
     //updating name 
     static void  updateRegistrationFee(int fee){
        registrationFee = fee ;
        System.out.println("registration update successfully");
     }
     //displaying vehicle details
     void display(){
         System.out.println("Registration Number: "+REGISTRATION_NUMBER);
         System.out.println("Name: "+ownerName);
         System.out.println("vehicle type: "+ vehicleType);
     }
}
