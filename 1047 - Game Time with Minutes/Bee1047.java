
import java.util.*;

public class Bee1047 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int hour = 0;
        int minute = 0;
        int initial_Hour = input.nextInt();
        int initial_Minute = input.nextInt();
        int final_Hour = input.nextInt();
        int final_Minute = input.nextInt();
        input.close();
        
        if(initial_Hour >= 0 && initial_Hour <= 24 && final_Hour >= 0 && final_Hour <= 24
            && initial_Minute >= 0 && initial_Minute <= 60 && final_Minute >= 0 &&
            final_Minute <= 60){
                if(final_Minute > initial_Minute){
                    minute = final_Minute - initial_Minute;
                }else if(final_Minute < initial_Minute){
                    minute = final_Minute - initial_Minute + 60;
                    final_Hour = final_Hour - 1;
                }
                if(final_Hour >= initial_Hour){
                    hour = final_Hour - initial_Hour;
                }else if(final_Hour < initial_Hour){
                    hour = final_Hour - initial_Hour + 24;
                }if(hour == 0 && minute == 0){
                    hour = 24;
                }
            }
            System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+minute+" MINUTO(S)");
    }
}
