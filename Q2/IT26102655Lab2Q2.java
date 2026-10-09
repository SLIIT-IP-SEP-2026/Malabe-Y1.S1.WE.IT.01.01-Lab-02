public class IT26102655Lab2Q2 {
    public static void main(String[] args) {
        // Square side length
        double length = 10.0;
        
        // Perimeter of the square = 4 * length
        double perimeter = 4.0 * length;
        
        // Value of PI given in the hint
        double pi = 3.14;
        
        // Circumference of Circle = 2 * PI * Radius
        // Perimeter = 2 * PI * Radius  =>  Radius = Perimeter / (2 * PI)
        double radius = perimeter / (2 * pi);
        
        // Display output
        System.out.println("Radius of the circular fence: " + radius);
    }
}