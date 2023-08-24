
import java.util.*;

public class Bee1065 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count = 0;

        for(int i=1;i<=5;i++){
            int num = input.nextInt();
            if(num%2 == 0){
                count++;
            }
        }
        input.close();
        System.out.println(count+" valores pares");
    }
}
