
import java.util.*;

public class Bee1070 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int count = 0;
        input.close();

        while(count < 6){
            if(num%2 != 0){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
