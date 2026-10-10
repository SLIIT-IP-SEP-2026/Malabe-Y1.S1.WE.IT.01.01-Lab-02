public class IT26102470Lab2Q3 {
   public static void main(String[] args) {
        double sideA = 3;
		double sideB = 4;
		double hypotenuse;
		
		// Hypotenuse = square root (SideA^2 + SideB^2)
		hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
		
		System.out.println("Length of the hypotenuse: " + hypotenuse);
	}
}