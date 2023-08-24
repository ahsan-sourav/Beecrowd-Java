
import java.util.*;

public class Bee1042 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        int arry[] = {a,b,c};
        int temp[] = {a,b,c};
        Arrays.sort(arry);

        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
        }
        
        System.out.printf("\n");

        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }
}
