public class IT26102719Lab2Q2 {
    public static void main(String[] args) {
        double side = 10;
        double pi = 3.14;

        double ropeLength = 4 * side; // Perimeter of square
        double radius = ropeLength / (2 * pi);

        System.out.println("Radius of the circular fence = " + radius);
    }
}