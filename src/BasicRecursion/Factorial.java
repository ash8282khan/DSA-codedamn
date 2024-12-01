package BasicRecursion;

import java.util.Scanner;

public class Factorial {
    public static double fact(int num){
        if(num<=1)
            return 1;
        else
            return fact(num-1)*num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n =sc.nextInt();
        double fac= fact(n);
        System.out.println("Factorial: "+ fac);
    }
}
