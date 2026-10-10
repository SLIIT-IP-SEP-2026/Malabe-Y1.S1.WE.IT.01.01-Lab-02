public class IT26102742Lab2Q1{
	public static void main(String[] args){
		double width;
		double length;
		int perimeter = 100;
		
		double w_ratio= 0.75;
		length = perimeter/(2*(1+w_ratio));
		width = w_ratio*length;
		System.out.println("length of the rectangle = "+length);
		System.out.println("width of the rectangle = "+width);
	}
}