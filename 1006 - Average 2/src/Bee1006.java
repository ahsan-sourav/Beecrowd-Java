
import java.util.*;

public class Bee1006 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		input.close();
		// The factor of 10 is introduced in the weights 
		//   because the weights are specified as 10 times their respective values.
		double average = (num1/10*2) + (num2/10*3) +(num3/10*5);
		
		System.out.printf("MEDIA = %.1f\n",average);
	}
}
