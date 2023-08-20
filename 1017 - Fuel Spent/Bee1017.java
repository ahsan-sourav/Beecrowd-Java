
import java.util.*;

public class Bee1017 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double hour = input.nextDouble();
        double speed = input.nextDouble();
        input.close();

        double cost = (hour*speed)/12;

        System.out.printf("%.3f\n",cost);
    }    
}
