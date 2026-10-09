public class IT26102655Lab2Q3 {
    public static void main(String[] args) {
        // Known side lengths
        double sideA = 3.0;
        double sideB = 4.0;
        
        // Hypotenuse = Math.sqrt(SideA^2 + SideB^2)
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        
        // Display output
        System.out.println("Length of the hypotenuse: " + hypotenuse);
    }
}