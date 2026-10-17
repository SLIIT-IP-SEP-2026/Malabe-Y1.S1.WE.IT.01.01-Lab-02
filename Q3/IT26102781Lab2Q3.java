public class IT26102781Lab2Q3 {
    public static void main(String[] args) {
        double SideA = 3;
        double SideB = 4;

        // square both sides
        double squareA = SideA * SideA;
        double squareB = SideB * SideB;

        // Adding
        double total = squareA + squareB;

        // Calculating square root
        double hypotenuse = Math.sqrt(total);

        System.out.println("Length of the hypotenuse: " + hypotenuse);
    }
}