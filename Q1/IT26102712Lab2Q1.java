public class IT26102712Lab2Q1{
	public static void main(String[] args){
	int perimeter = 100;
	double length;
	double width;
	double width_ratio = 0.75;
	length = (perimeter/2)/(1+width_ratio);
	width = length*width_ratio;
	System.out.println("Length =" + length);
	System.out.print("Width =" + width);
	}
}