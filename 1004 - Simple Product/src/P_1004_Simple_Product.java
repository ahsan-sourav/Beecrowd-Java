
import java.util.*;

public class P_1004_Simple_Product{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		input.close();
		int prod = num1*num2;
		
		System.out.println("PROD = "+prod);
	}
}
