public class IT26102413Lab2Q3 {
 
    
	public static void main(String[] args) {
	
	
	    int sideA = 3;// Give Side A 
		int sideB = 4;// Give Side B 
		double hypotenuse;
		
		// Hypotenuse formula: sqrt(A^2 + B^2)
		// A^2 = 3^2 = 9, B^2 = 4^2 = 16
		
		// Hypotenuse = square root (SideA^2 + SideB^2)
		hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
		
		//+ - Concatanate
		System.out.println("Length of the hypotenuse: " + hypotenuse);
		}
		
}