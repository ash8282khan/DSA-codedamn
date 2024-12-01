package BasicMaths;

public class Prime {
    public static void main(String []args){
        int num=13,f=0;

        for (int i=2;i<=(num/2);i++){
            if (num%i==0) {
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.println("it is not prime");
        else
            System.out.println("it is prime");
    }
}
