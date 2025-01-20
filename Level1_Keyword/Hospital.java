public class Hospital{
    public static void main(String[] args) {
            //Creating instance of class patient
            Patient pat1 = new Patient("Kancha", "7fdg258654659",12,false);
            Patient pat2 = new Patient("Princi", "7dfv01258654659",23,true);
            Patient pat3 = new Patient("Viraj", "7410sdf8654659",45,true);
            //Total Patient
            Patient.getTotalPatient();
            //Displaying patients
            pat1.display();
            pat2.display();
            pat3.display();
    
            // checking Instance 
    
            if (pat1 instanceof Patient){
                System.out.println("Yes this is instance of parent class");
            }
            else{
                System.out.println("No, this is not instance of parent class");
            }
        
    }
}