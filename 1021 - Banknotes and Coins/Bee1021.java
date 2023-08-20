
import java.util.*;

public class Bee1021 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double value = input.nextDouble();
        input.close();

        int cents = (int) (value * 100);
        int[] banknotes = {10000,5000,2000,1000,500,200};
        int[] coins = {100,50,25,10,5,1};
        
        System.out.println("NOTAS:");
        for (int notes : banknotes) {
            int count = cents / notes;
            cents %= notes;
            System.out.printf("%d nota(s) de R$ %.2f%n",count,notes/100.0);
        }

        System.out.println("MOEDAS:");
        for (int coin : coins) {
            int count = cents / coin;
            cents %= coin;
            System.out.printf("%d moeda(s) de R$ %.2f%n",count,coin/100.0);
        }
    }
}
