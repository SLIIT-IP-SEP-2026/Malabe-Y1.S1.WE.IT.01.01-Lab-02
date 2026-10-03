public class IT26102199Lab2Q1 {
	public static void main(String[] args) {
		int peri = 100;
		double width_ratio = 0.75;
		double len;
		double width;
		
		len = (peri / (2 * (1 + width_ratio)));
		width = width_ratio * len;
		
		System.out.println("Length of the fence: " + len);
		System.out.println("Width of the fence: " + width);

	}
}