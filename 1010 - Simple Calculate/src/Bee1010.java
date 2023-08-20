
import java.util.*;

public class Bee1010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int p1 = input.nextInt();
		int units1 = input.nextInt();
		double price1 = input.nextDouble();
		int p2 = input.nextInt();
		int units2 = input.nextInt();
		double price2 = input.nextDouble();
		input.close();
		
		double total = (units1*price1) + (units2*price2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
	}
}
