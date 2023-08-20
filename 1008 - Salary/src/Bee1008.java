
import java.util.*;

public class Bee1008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		double hour = input.nextDouble();
		double pay = input.nextDouble();
		input.close();
		
		double salary = (hour*pay);
		
		System.out.println("NUMBER = "+num);
		System.out.printf("SALARY = U$ %.2f\n",salary);
	}
}
