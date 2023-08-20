
import java.util.*;

public class Bee1019 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int time = input.nextInt();
        input.close();

        int hours = time/3600;
        int remainingTime = time%3600;
        int minutes = remainingTime/60;
        int finalSeconds = remainingTime%60;

        System.out.printf("%d:%d:%d\n",hours,minutes,finalSeconds);
    }
}
