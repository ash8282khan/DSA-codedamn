package SpaceTimeComplexity;

public class Quad {
    public static void main(String []args){ //O(n^2)

        int[] arr = new int[]{1,2,3,4,5,5,4,6,7,2,3};
        //find the pair

        int target = 9;

        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
