
import java.util.*;

public class Bee1060 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count = 0;
        for(int i=1;i<=6;i++){
            double n = input.nextDouble();
            input.close();
            if(n>0){
                count++;
            }
            System.out.println(count+" valores positivos");
        }
    }
}
