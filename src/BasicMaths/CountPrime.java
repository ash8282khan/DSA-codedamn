package BasicMaths;

public class CountPrime {
    public static boolean isPrime(int n){
            for(int i=2 ;i<=n/2;i++){
                if(n%i==0)
                    return false;
            }
        return true;
    }
    public static void main(String []args){
        int c=0,num=11;
        for (int i=2;i<=num;i++){
            if(isPrime(i))
                c++;
        }
        System.out.println(c);
    }
}
