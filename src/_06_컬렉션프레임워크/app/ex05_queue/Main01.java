package _06_컬렉션프레임워크.app.ex05_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main01 {
    public static void main(String[] args) {
        
        Queue<String> printQueue = new ArrayDeque<>();
        
        printQueue.offer("doc1");
        printQueue.offer("doc2");
        printQueue.offer("doc3");
        System.out.println("printQueue = " + printQueue);

        System.out.println("printQueue.poll() = " + printQueue.poll());
        System.out.println("printQueue.poll() = " + printQueue.poll());
        System.out.println("printQueue.poll() = " + printQueue.poll());
        System.out.println("printQueue = " + printQueue);
    }
}
