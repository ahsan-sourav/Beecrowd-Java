
import java.util.*;

public class Bee1073 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        input.close();

        for(int i=1;i<=num;i++){
            if(i%2 == 0){
                int squr = i*i;
                System.out.println(i+"^2 = "+squr);
            }
        }
    }
}
