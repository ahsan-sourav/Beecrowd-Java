
import java.util.*;

public class Bee1018 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int money = input.nextInt();

        System.out.println(money);
        int[] banknotes = {100,50,20,10,5,2,1};

        for(int note:banknotes){
            int count = money/note;
            System.out.println(count + " nota(s) de R$ " + note + ",00");
            money %= note;
        }
        input.close();
    }    
}
