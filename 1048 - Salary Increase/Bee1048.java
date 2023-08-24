
import java.util.*;

public class Bee1048 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double earned = 0,total = 0;
        double salary = input.nextFloat();
        input.close();

        if(salary>=0.00 && salary<=400.00){
             earned = (salary*0.15);
             total = salary+earned;
             System.out.printf("Novo salario: %.2f\n",total);
             System.out.printf("Reajuste ganho: %.2f\n",earned);
             System.out.println("Em percentual: 15 %");
        }else if(salary>=400.01 && salary<=800.00){
             earned = (salary*0.12);
             total = salary+earned;
             System.out.printf("Novo salario: %.2f\n",total);
             System.out.printf("Reajuste ganho: %.2f\n",earned);
             System.out.println("Em percentual: 12 %");
        }else if(salary>=800.01 && salary<=1200.00){
             earned = (salary*0.10);
             total = salary+earned;
             System.out.printf("Novo salario: %.2f\n",total);
             System.out.printf("Reajuste ganho: %.2f\n",earned);
             System.out.println("Em percentual: 10 %");
        }else if(salary>=1200.01 && salary<=2000.00){
             earned = (salary*0.07);
             total = salary+earned;
             System.out.printf("Novo salario: %.2f\n",total);
             System.out.printf("Reajuste ganho: %.2f\n",earned);
             System.out.println("Em percentual: 7 %");
        }else if(salary > 2000.00){
             earned = (salary*0.4);
             total = salary+earned;
             System.out.printf("Novo salario: %.2f\n",total);
             System.out.printf("Reajuste ganho: %.2f\n",earned);
             System.out.println("Em percentual: 4 %");
        }
    }
}
