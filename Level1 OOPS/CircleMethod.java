public class CircleMethod {
    double radius;

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
