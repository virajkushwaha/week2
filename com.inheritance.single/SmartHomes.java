class Device{
    private int deviceId;
    private String status;

    //constructor
    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    
    //method display
    public void displayMethod(){
        System.out.println("ID: "+ deviceId);
        System.out.println("Status:"+status);
    }


}

class Thermostat extends Device{
    private String tempratureSetting;
    
        //constructor
        public Thermostat(int deviceId, String status, String temperatureSetting) {
            super(deviceId, status);
            this.tempratureSetting = temperatureSetting;
    }

    @Override
    //Overriding the displayStatusMethod 
    public void displayMethod(){
        super.displayMethod();
        System.out.println("Temperature Setting: "+tempratureSetting);
        }
}

public class SmartHomes {
    public static void main(String[] args) {
        // Creating an object of Thermostat class
        Thermostat thermostat = new Thermostat(1, "ON", "20");
        thermostat.displayMethod();
        
    }
}
