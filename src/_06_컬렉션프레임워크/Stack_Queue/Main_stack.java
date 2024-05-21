package _06_컬렉션프레임워크.Stack_Queue;

import java.util.Stack;

public class Main_stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("stack = " + stack);

        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack = " + stack);

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
    }
}
