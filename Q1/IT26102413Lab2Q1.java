public class IT26102413Lab2Q1 {

    public static void main(String[] args){
		
	
	    int perimeter = 100;// Give perimeter of the fence
		double length;
		double width;
		
		// width to length ratio: 3/4 = 0.75
		double width_ratio = 0.75;
		
		// 100 = 2 * (length + (width_ratio * length))
		length = perimeter / (2 * (1 + width_ratio)) ;
		width = width_ratio * length;
		
		//+ - Concatanate
		System.out.println("Length of the fence: " + length);
		
		System.out.println("width of the fence: " + width );
	}
			
}		