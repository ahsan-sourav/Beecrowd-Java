
import java.util.*;

public class Bee1011 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double R = input.nextDouble(); // R = radius
		input.close();
		
		double volume = (4.0/3)* 3.14159*(R*R*R);
		
		System.out.printf("VOLUME = %.3f\n",volume);
	}
}
