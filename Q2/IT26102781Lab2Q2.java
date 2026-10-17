public class IT26102781Lab2Q2{
    public static void main(String[] args) {
        double length = 10;

        //perimeter of the square
        double squarePerimeter = 4 * length;

        // circumference a of circle
        double PI = 3.14;
        double radius = squarePerimeter / (2 * PI);

        System.out.println("Radius of the circular fence: " + radius);
    }
}