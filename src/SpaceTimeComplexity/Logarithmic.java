package SpaceTimeComplexity;



public class Logarithmic { //O(log n)
    public static void main(String []args){

        int [] arr = new int[]{1,4,12,33,40,60};
        //binary search

        int start =0;
        int end = arr.length-1;

        while (start <= end){
            int mid=(start+end)/2;
            if (arr[mid]==40){
                System.out.println("found at "+mid);
                break;
            } else if (arr[mid]<40) {
                start=mid+1;
            }else{
                end =mid-1;
            }
        }
    }
}
