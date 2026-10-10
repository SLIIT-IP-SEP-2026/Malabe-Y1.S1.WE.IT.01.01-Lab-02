public class IT26102413Lab2Q2 {

    public static void main(String[] args) {
	
	
	    int length = 10;// Give lengthof a side of the square 
		double radius;
		double PI;
		
		// PI value
		PI = 3.14;
		
		// Perimeter of a Square = 4 * length
		double perimeter = 4 * length;
		
		// Cirumference of Circle = 2 * PI * Radius
		// So Radius = Circumference / (2 * PI)
		// Here Circumference = perimeter of square
		radius = perimeter / (2 * PI);
		
		//+- Concatanate
		System.out.println("Radius of the circular fence: " + radius);
	}
	
	
}