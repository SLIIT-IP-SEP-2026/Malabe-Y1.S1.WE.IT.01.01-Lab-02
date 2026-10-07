public class Main {
    public static void main(String[] args) {

        double length = 10;
        double pi = 3.14;

        // Calculate perimeter of the square
        double perimeter = 4 * length;

        // Calculate radius of the circle
        double radius = perimeter / (2 * pi);

        System.out.println("Radius of the circular fence = " + radius);
    }
}