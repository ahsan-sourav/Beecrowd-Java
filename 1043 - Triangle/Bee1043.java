
import java.util.*;

public class Bee1043 {
    public static void main(String[] args){
		Scanner input =new Scanner(System.in);

		float A = input.nextFloat();
		float B = input.nextFloat();
		float C = input.nextFloat();
		input.close();

		if((A<(float)(B+C)) && (B<(float)(A+C)) && (C<(float)(B+A))){

			float perimeterTriangle = (A+B+C);
			System.out.printf("Perimetro = %.1f\n",perimeterTriangle);
		
			
		}else{
			float areaTraphisium = ((A+B)*C)/2;
			System.out.printf("Area = %.1f\n",areaTraphisium);
		}

	}
}
