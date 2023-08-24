
import java.util.*;

public class Bee1046 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int duration = 0;
        int startHour = input.nextInt();
        int endHour = input.nextInt();
        input.close();
        
        if(startHour<=24 && endHour<=24 && startHour>=0 && endHour>=0){
            if(endHour > startHour){
                duration = endHour-startHour;
            }else if(endHour < startHour || endHour == startHour){
                duration = (endHour-startHour)+24;
            }
            System.out.println("O JOGO DUROU "+duration+" HORA(S)");
        }
    }
}
