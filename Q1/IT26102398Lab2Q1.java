public class IT26102398Lab2Q1 {
    public static void main (String[] args) {
        // Variables
        double length, width, width_Ratio  =  3.0 /  4.0;
        int perimeter = 100;
        // Hint
        length = perimeter /  (2 * (1 + width_Ratio));
        width = length * width_Ratio;
        // Program output
        System.out.println("Length of the fence: " + length);
        System.out.println("Width of the fence: " + width);
    }
}