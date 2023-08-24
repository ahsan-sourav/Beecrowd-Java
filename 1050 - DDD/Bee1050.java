
import java.util.*;

public class Bee1050 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int id = input.nextInt();
        input.close();

        if(id == 61){
            System.out.println("Brasilia");
        }else if(id == 71){
            System.out.println("Salvador");
        }else if(id == 11){
            System.out.println("Sao Paulo");
        }else if(id == 21){
            System.out.println("Rio de Janeiro");
        }else if(id == 32){
            System.out.println("Juiz de Fora");
        }else if(id == 19){
            System.out.println("Campinas");
        }else if(id == 27){
            System.out.println("Vitoria");
        }else if(id == 31){
            System.out.println("Belo Horizonte");
        }else{
            System.out.println("DDD nao cadastrado");
        }
    }
}
