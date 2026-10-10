public class IT26102060Lab2Q1{
	public static void main (String[] args){
		double perimeter = 100.0;
		double length;
		double width;
		
		//widthRatio = 3/4
		double widthRatio = 0.75;
		
		length =  perimeter / (2 * (1 + widthRatio));
		width = widthRatio * length;
		
		
		System.out.println ("Length of the fence " + length);
		System.out.println ("Width of the fence " + width);
		
		
		
		

		}
}