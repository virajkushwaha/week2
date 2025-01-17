import java.util.Scanner;

public class Circle {
    
   
    public static void main(String[] args) {
        
        System.out.println("Enter the radius of the circle:");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        CircleMethod c = new CircleMethod(radius);
        System.out.println("Area: "+ c.area(radius));
        System.out.println("Circumference: "+c.circumference(radius));
    }
}
