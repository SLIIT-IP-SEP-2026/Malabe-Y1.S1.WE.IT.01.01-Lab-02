public class IT26300636Lab2Q2 {
	public static void main(String[] args){
		
		//given length of side of square
		double length = 10.0;
		
		//calculate the perameter
		double parameter = 4.0 * length;
		
		//value of pI
		double PI = 22.0/7.0;
		
		//calculate the radius
		//circumference  = 2 * PI * radius
		//parameter = circumference
		double radius =  parameter/(2.0 * PI);
		
		//output the result
		System.out.println("radius of circular fence " + radius);
		
		
	}
	
}