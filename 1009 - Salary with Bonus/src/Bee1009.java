
import java.util.*;

public class Bee1009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = input.nextLine();
		double salary = input.nextDouble();
		double sale = input.nextDouble();
		input.close();
		
		double totalSalary = (sale*0.15) + salary;
		
		System.out.printf("TOTAL = R$ %.2f\n",totalSalary);
	}
}
