package _06_컬렉션프레임워크.Stack_Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main_queue {
    public static void main(String[] args) {

//        Queue<Integer> queue2 = new LinkedList<>();
        Queue<Integer> queue = new ArrayDeque<>();          // 이게 더 빠름...
        
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("queue = " + queue);
        
        // 단순 조회
        System.out.println("queue.peek() = " + queue.peek());
        System.out.println("queue = " + queue);
        
        // 데이터 꺼내기
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue = " + queue);
    }
}
