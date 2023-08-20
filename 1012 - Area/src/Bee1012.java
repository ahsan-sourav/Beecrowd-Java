
import java.util.*;

public class Bee1012 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();
		
		double triangle = (0.5*a*c);
		double circle = (3.14159*c*c);
		double trapezium = ((a+b)*c)/2;
		double square = (b*b);
		double rectangle = (a*b);
		
		System.out.printf("TRIANGULO: %.3f\n",triangle);
		System.out.printf("CIRCULO: %.3f\n",circle);
		System.out.printf("TRAPEZIO: %.3f\n",trapezium);
		System.out.printf("QUADRADO: %.3f\n",square);
		System.out.printf("RETANGULO: %.3f\n",rectangle);
	}
}
