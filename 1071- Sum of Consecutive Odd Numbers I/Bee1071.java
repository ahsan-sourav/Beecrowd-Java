
import java.util.*;

public class Bee1071 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int x = input.nextInt();
        int y = input.nextInt();
        input.close();

        if(x>y){
            for(int i=x-1;i>y;i--){
                if(i%2 != 0){
                    total += 1;
                }
            }
        }else{
            for(int i=y-1;i>x;i--){
                if(i%2 != 0){
                    total += 1;
                }
            }
        }
        System.out.println(total);
    }
}
