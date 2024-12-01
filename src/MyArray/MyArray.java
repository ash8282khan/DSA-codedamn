package MyArray;

public class MyArray {
    private int [] items;
    private int currentIndex;

    public MyArray(int initialSize){
        this.items = new int[initialSize];
        this.currentIndex=0;
    }
    public void insert (int value){
        if (currentIndex==items.length){
            int [] temp = new int[items.length*2];
            for (int j=0;j< currentIndex;j++)
                temp[j] = items[j];
            items = temp;
        }
        this.items[currentIndex]= value;
        currentIndex++;
    }
    public  int indexOf(int value){
        for (int i=0; i< this.currentIndex; i++){
            if(this.items[i]== value) return i;
        }
        return -1;
    }

    public void removeAt(int index){
        for(int i=index; i<=this.currentIndex-2;i++){
            this.items[i]=this.items[i+1];
            currentIndex--;
            this.items[currentIndex]=0;
        }
    }
    public int max(){
        int result = this.items[0];
        for(int i= 1;i<currentIndex;i++){
            if (items[i]>result){
                result=items[i];
            }
        }
        return result;
    }
    public int min(){
        int result1 = this.items[0];
        for(int i= 1;i<currentIndex;i++){
            if (items[i]< result1){
                result1=items[i];
            }
        }
        return result1;
    }
    public void reverse( ){
        int i=0;
        int j=this.currentIndex;

        while(i < j){
            int temp = items[i];
            items[i]= items[j];
            items[j]= temp;
            i++;
            j--;
        }
    }
    public String toString(){
//        String str = new String();
//        for (int num: this.items){
//            str=str+(num + ", ");
//        }
//        return str;
        StringBuilder str = new StringBuilder();
        str.append("[");
        for(int num: this.items){
            str.append(num + ",");
        }
        str.append("\b").append("]");
        return str.toString();
    }
}
