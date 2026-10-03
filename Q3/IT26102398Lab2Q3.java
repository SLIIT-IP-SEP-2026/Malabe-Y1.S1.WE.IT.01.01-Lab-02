public class IT26102398Lab2Q3 {
    public static void main (String[] args) {
        // Side lengths
        int A = 3, B = 4;
        double hypotenuse;
        // Expression
        hypotenuse = Math.sqrt((A * A) + (B * B)); // (Math.pow(A, 2)) + (Math.pow(B, 2))
        // Hypotenuse
        System.out.println("Hypotenuse of Right triangle: " + hypotenuse);
    }
}