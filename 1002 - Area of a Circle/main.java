// 1002 - Area of a Circle;;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double n = 3.14159;
        double A = n*(r*r);

        System.out.print("A=");
        System.out.println(A);

    }
}