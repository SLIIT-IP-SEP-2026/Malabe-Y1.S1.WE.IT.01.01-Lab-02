public class IT26102663Lab2Q1 {
    public static void main(String[] args)   {
	int perimeter = 100;
	double length;
	double width;
	double widthRatio = 0.75;
	length = (perimeter/2)/(1+widthRatio);
	width = length*widthRatio;
	System.out.println("Length="  +length);
	System.out.print("Width="  +width);
	}
}