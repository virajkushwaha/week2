public class CircleMethod {
    double radius;
    CircleMethod() {
        
        System.err.println("Default constructor");
    }
    // Constructor to initialize the radius
    CircleMethod(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate area
    double area(double radius) {
        return Math.PI * (radius * radius);
    }

    // Method to calculate circumference
    double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
