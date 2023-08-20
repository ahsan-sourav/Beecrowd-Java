
import java.util.*;

public class P_1005_Average1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		input.close();
		
		double average = (num1/11*3.5)+(num2/11*7.5);//((a / 11 * 3.5) + (b / 11 * 7.5));
		
		System.out.printf("MEDIA = %.5f\n",average);
	}

}
