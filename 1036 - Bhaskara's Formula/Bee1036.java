
import java.util.*;

public class Bee1036 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();

        if((a==0) || (((b*b)-(4*a*c))<0)){
            System.out.println("Impossivel calcular");
        }else{
            double R1 = ((-b + Math.sqrt(((b*b) -(4*a*c)))) / (2*a));
            double R2 = ((-b - Math.sqrt(((b*b) -(4*a*c)))) / (2*a));

            System.out.printf("R1 = %.5f\n",R1);
            System.out.printf("R2 = %.5f\n",R2);
        }
    }
    
}
