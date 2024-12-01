package MyStack;

import java.util.EmptyStackException;
import java.util.Stack;

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
        if(this.top==size) throw new StackOverflowError();  //Stack Overflow

        this.items[top]=value;
        this.top++;
    }

    public int pop() {
        if (top == 0) throw new EmptyStackException(); //Stack Underflow

        this.top--;
        int value = items[top];
        items[top] = 0;
        return value;
    }

    public int peek(){
        if (top == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return items[top-1];
    }
    public int size(){
        return top;
    }

    public boolean isEmpty(){
        if(size()==0) return true;
        else return false;
    }
    public  String toString(){
        StringBuilder sb= new StringBuilder();
        for (int i=size-1;i>=0;i--){
            sb.append(items[i]).append("\n");
        }
        return sb.toString();
    }
}
