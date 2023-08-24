
import java.util.*;

public class Bee1045 {
    public static void main(String[] args){
		Scanner input =new Scanner(System.in);

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
        input.close();

        //for arranging input in decreasing order
		double A = Math.max(a,Math.max(b,c));
		double B = 0;
		double C = 0;
		
		if (A == a){
			B =Math.max(b,c);
			C =Math.min(b,c);
		}if(A == b){
			B =Math.max(a,c);
			C =Math.min(a,c);
		}if(A == c){
			B =Math.max(c,a);
			C =Math.min(b,a);
		}
	
		if(A >= (B+C)){
			System.out.print("NAO FORMA TRIANGULO\n");
		}else if(A*A > ((B*B)+(C*C))){
			System.out.print("TRIANGULO OBTUSANGULO\n");
		}if(A*A == ((B*B)+(C*C))){
			System.out.print("TRIANGULO RETANGULO\n");
		}if(A*A < ((B*B)+(C*C))){
			System.out.print("TRIANGULO ACUTANGULO\n");
		}if((A == B) &&(A== C)){
			System.out.print("TRIANGULO EQUILATERO\n");
		}if(((A==B) && (A!=C)) || ((A==C) && (A!=B)) || ((B==C) && (B!=A)) ){
			System.out.print("TRIANGULO ISOSCELES\n");
		}
    }
}
