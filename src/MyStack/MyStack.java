package MyStack;

public class MyStack {
    private int[] items;
    private int top;
    private int size;
    public MyStack(int size){
        this.size = size;
        this.items = new int [size];
        this.top=0;
    }
    public void push(int value){
        if(this.top==size){
            System.out.println("Stack is full");
        }
        this.items[top]=value;
        this.top++;
    }
    public int size(){
        return top;
    }
    public  String toString(){
        StringBuilder sb= new StringBuilder();
        for (int i=size-1;i>=0;i--){
            sb.append(items[i]).append("\n");
        }
        return sb.toString();
    }
}
