package SpaceTimeComplexity;

public class Constant {// O(1)
    public static void main(String []args){
        int[] arr = new int[]{1,2,3,4,5};
        int num = arr[arr.length-1];
        arr[0]=arr[0]+10;   //O(1) TC|SC
        System.out.println(arr[0]+num);
    }
}
