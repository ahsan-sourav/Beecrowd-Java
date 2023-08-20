
import java.util.*;

public class Bee1020 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        input.close();

        int years = age/365;
        int remainingAge = age%365;
        int month = remainingAge/30;
        int days = remainingAge%30;
        
        System.out.println(years+" ano(s)");
        System.out.println(month+" mes(es)");
        System.out.println(days+" dia(s)");
    }
}
