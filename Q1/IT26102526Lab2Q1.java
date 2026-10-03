public class IT26102526Lab2Q1{
	
	public static void main(String[] args) {
	int perimeter = 100;
	double width;
	double length;
	
	double width_ration = 0.75;
	
	length = perimeter / (2 * (1 + width_ration));
	width= width_ration * length;
	
	//+ - Concatenate
	System.out.println("Length of the fence: " + length);
	
	System.out.println("Width of the fence: " + width);


	}


}