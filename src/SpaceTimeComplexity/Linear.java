package SpaceTimeComplexity;

public class Linear { //O(n)
    public static void main(String []args){
        int[] arr = new int[]{1,2,3,4,5};
        for (int j : arr) {//O(n) TC
            System.out.println(j);
        }

        int[] newArr = new int [arr.length];// SC - o(n)
        int i=0;
        for (int j : arr) {//O(n) TC
            newArr[i]=j;
            System.out.println(newArr[i]);
            i++;
        }
    }
}
