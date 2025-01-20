

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        //Creating instance 
        Vehicle veh1 = new Vehicle("Kancha", "mp04st2426","A");
        Vehicle veh2 = new Vehicle("Kancha", "mpds55","C");
        Vehicle veh3 = new Vehicle("Kancha", "dv98g4df","D");

        Vehicle.updateRegistrationFee(15);

        veh1.display();
        veh2.display();
        veh3.display();

        // checking Instance 

        if (veh1 instanceof Vehicle){
            System.out.println("Yes this is instance of parent class");
        }
        else{
            System.out.println("No, this is not instance of parent class");
        }
    }
}
