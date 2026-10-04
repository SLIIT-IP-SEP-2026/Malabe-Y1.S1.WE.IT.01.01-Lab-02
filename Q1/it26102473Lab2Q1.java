public class IT26102473Lab2Q1
{
            public static void main(String[] args)
			{ 
				    double perimeter;
					double width_ratio;
					double length;
					double width;
					
					perimeter = 100;//Given that perimeter of the fence
					width_ratio = 0.75;//ratio between width to length:3/4=0.75
					length = perimeter / (2*(1+width_ratio));//Given that perimeter of the rectangle is 2*(length + width)
					width = width_ratio*length;
					
					System.out.println("Length of the fence: " + length);
                    System.out.println("Width of the fence: " + width);
			}
}
				