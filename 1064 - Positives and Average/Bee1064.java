
import java.util.*;

public class Bee1064 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count = 0;
        float average = 0,total = 0;

        for(int i=1;i<=6;i++){
            float num = input.nextFloat();
            if(num > 0){
                count += 1;
                total += num;
            }
        }
        input.close();
        average = total/count;

        System.out.println(count+" valores positivos");
        System.out.printf("%.1f\n",average);
    }
}
