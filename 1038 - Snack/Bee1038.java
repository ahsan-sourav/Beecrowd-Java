
import java.util.*;

public class Bee1038 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int code = input.nextInt();
        int product = input.nextInt();
        input.close();

        if(code == 1){
            double price = (product*4.00);
            System.out.printf("Total: R$ %.2f\n",price);
        }else if(code == 2){
            double price = (product*4.50);
            System.out.printf("Total: R$ %.2f\n",price);
        }else if(code == 3){
            double price = (product*5.00);
            System.out.printf("Total: R$ %.2f\n",price);
        }else if(code == 4){
            double price = (product*2.00);
            System.out.printf("Total: R$ %.2f\n",price);
        }else if(code == 5){
            double price = (product*1.50);
            System.out.printf("Total: R$ %.2f\n",price);
        }
    }
}
