
import java.util.*;

public class Bee1014 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int distance = input.nextInt();
        double fuel = input.nextDouble();
        input.close();

        double Consumption = (distance/fuel);
        System.out.printf("%.3f km/l\n",Consumption);


    }    
}
