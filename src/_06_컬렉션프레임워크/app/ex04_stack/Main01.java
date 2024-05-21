package _06_컬렉션프레임워크.app.ex04_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main01 {
    public static void main(String[] args) {

        Deque<String> address = new ArrayDeque<>();
        
        address.push("youtube.com");
        address.push("google.com");
        address.push("facebook.com");
        System.out.println("address = " + address);

        System.out.println("address.pop() = " + address.pop());
        System.out.println("address.pop() = " + address.pop());
        System.out.println("address.pop() = " + address.pop());
        System.out.println("address = " + address);
    }
}
