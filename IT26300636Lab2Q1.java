public class IT26300636Lab2Q1 {
    public static void main(String[] args) {
        // Given perimeter
        double perimeter = 100.0;
        
         
         // Mathematical derivation:
         // Perimeter = 2 * (length + width)
         // width = (3.0 / 4.0) * length
         
         // Substituting width into the perimeter formula:
         // perimeter = 2 * (length + 0.75 * length)
         // perimeter = 2 * (1.75 * length)
         // perimeter = 3.5 * length
         //length = perimeter / 3.5
         
        
        double length = perimeter / 3.5;
        double width = (3.0 / 4.0) * length;
        
        // Displaying the results
        System.out.println("--- Rectangular Fence Dimensions ---");
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}