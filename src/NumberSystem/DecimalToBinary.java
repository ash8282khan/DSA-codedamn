package NumberSystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int num= sc.nextInt();
        int rem;
        StringBuilder res = new StringBuilder();
        while(num > 0){
            rem = num%2;
            num=num/2;
            res.insert(0, rem);
//            res=rem+res;
        }
        System.out.println(res);
    }
}
