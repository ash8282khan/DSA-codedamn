package BasicMaths;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n =sc.nextInt();
        double fac=1;

        for (int i=n;i>1;i--){
            fac=fac*i;
        }
        System.out.println("factorial: "+fac);
    }
}
