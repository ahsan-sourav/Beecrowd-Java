
import java.util.*;

public class Bee1007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		input.close();
		
		int dif = (num1*num2)-(num3*num4);
		System.out.println("DIFERENCA = "+dif);
	}
}
