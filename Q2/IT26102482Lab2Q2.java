public class IT26102482Lab2Q2
{
            public static void main(String[] args)
			{                    
	                double length;
					double perimeter;
					double pi;
					double radius;
					
					length = 10;//Given that length of the side of a sqaure is 10
					perimeter = 4*length;
					pi = 3.14;//Given that pi value is 3.14
					radius  = perimeter / (2*pi);//Given circumference of circle is 2*pi*radius and here circumference is equal to perimeter
					
					System.out.println("radius of the circle: " + radius);
			}
}