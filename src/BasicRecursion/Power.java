package BasicRecursion;

import java.util.Scanner;

public class Power {
    public static int pow(int num ,int p){
        if (p==0) return 1;
        if (p==1) return num;
        return num*pow(num,p-1);
    }
    public static void main(String[] args) {
        int num,res=1;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        num=sc.nextInt();
        System.out.println("Enter power on number: ");
        int p=sc.nextInt();
        res= pow(num,p);
        System.out.println("Power: "+ res);
    }
}
