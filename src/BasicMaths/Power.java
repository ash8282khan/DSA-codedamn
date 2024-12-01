package BasicMaths;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        int num,res=1;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        num=sc.nextInt();
        System.out.println("Enter power on number: ");
        int pow=sc.nextInt();
        for (int i=0;i<pow;i++){
            res=res*num;
        }
        System.out.println("Power: "+ res);
    }
}
