public class IT26102398Lab2Q2 {
    public static void main (String[] args) {
        // Constants
        int length = 10;
        // Variables
        double perimeter, circumference, radius, pi = 3.14;
        // Expressions
        perimeter = 4.0 * length;
        circumference = perimeter;
        radius = circumference / (2 * pi);
        // Radius
        System.out.println("Radius of the circular fence: " +radius);
    }
}