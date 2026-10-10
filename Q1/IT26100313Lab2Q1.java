public class IT26100313Lab2Q1{
	public static void main(String[] args){
		 double perimeter = 100;
		 
		 /* perimeter = 2*(length + width)
		    perimeter = 2*( length + 0.75*length)
		    perimeter = 3.5*length 
		    
			width = 0.75*length */
			
		double length = perimeter/3.5;
		double width = 0.75*length;
		
		System.out.println("length= "+ length);
		System.out.println("width = "+ width);
		
	}
	
}