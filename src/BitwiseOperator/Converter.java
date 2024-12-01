package BitwiseOperator;

public class Converter {
    public void toBinary(int d ){
        String res = "";
        while (d != 0) {
            res = (d & 1) + res;
            d = d >> 1;
        }
        System.out.println(res);
    };
    public void toDecimal(int b){
        int res=0,rem;
        int index=0;

        while (b != 0) {
            rem = b%10;
            if(rem==1)
                res=res+(int)Math.pow(2,index);
            index++;
            b=b/10;
        }
        System.out.println(res);
    }

    public static void main(String []args ) {
        Converter cv = new Converter();
        cv.toBinary(12);
        cv.toBinary(128);
        cv.toDecimal(1010);
        cv.toDecimal(10000000);

    }
}
