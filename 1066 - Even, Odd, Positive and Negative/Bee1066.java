
import java.util.*;

public class Bee1066 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int num;
        int positive = 0,nagetive = 0,odd = 0,even = 0;

        for(int i=1;i<=5;i++){
            num = input.nextInt();

            if(num%2 == 0){
                even++;
            }else{
                odd++;
            }if(num > 0){
                positive++;
            }else if(num < 0){
                nagetive++;
            }
        }
        input.close();
        System.out.println(even+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(positive+" valor(es) positivo(s)");
        System.out.println(nagetive+" valor(es) negativo(s)");

    }
}
