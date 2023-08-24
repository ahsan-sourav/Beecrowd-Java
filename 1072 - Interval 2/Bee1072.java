
import java.util.*;

public class Bee1072 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int  in = 0,out = 0;
        int testcase = input.nextInt();

       for(int i=1;i<=testcase;i++){
            int x = input.nextInt();

            if(x>=10 && x<=20){
                in++;
            }else{
                out++;
            }
       }
       input.close();
       System.out.println(in+" in");
       System.out.println(out+" out");
    }
}
