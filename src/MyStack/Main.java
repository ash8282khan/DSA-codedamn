package MyStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        MyStack stack= new MyStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        stack.push(6);

        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.isEmpty());

    }
}
