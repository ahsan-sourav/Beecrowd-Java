import java.util.*;

public class Bee1013{
    public static void main(String[] args){
        int a,b,c;
        int mainorAB;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        input.close();

        mainorAB = Math.max(a,Math.max(b,c));
        System.out.println(mainorAB+" eh o maior");
        
    }
}