public class IT26100568Lab2Q2 {
    public static void main(String[] args) {

        double length = 10;
        double perimeter;
        double radius;
        double PI = 3.14;

        // Perimeter of square
        perimeter = 4 * length;

        // Circumference of circle = 2 * PI * radius
        radius = perimeter / (2 * PI);

        System.out.println("Radius of the circular fence: " + radius);
    }
}