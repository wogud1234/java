package _06_컬렉션프레임워크.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main_deque {
    public static void main(String[] args) {

//        Deque<Integer> deque = new LinkedList<>();
        Deque<Integer> deque = new ArrayDeque<>();      // 이게 더 빠름..
        
        deque.offerFirst(1);
        System.out.println("deque = " + deque);
        deque.offerFirst(2);
        System.out.println("deque = " + deque);
        deque.offerFirst(3);
        System.out.println("deque = " + deque);

        deque.offerLast(4);
        System.out.println("deque = " + deque);
        deque.offerLast(5);
        System.out.println("deque = " + deque);
        deque.offerLast(6);
        System.out.println("deque = " + deque);

        // 조회만...
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());
        System.out.println("deque = " + deque);
        
        // 꺼내기...
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println("deque = " + deque);
    }
}

/*
    - Deque (Double Ended Queue)
        : 양쪽 끝에서 요소를 추가하거나 제가할 수 있다.
          일반적인 큐와 스택의 기능을 모두 포함하고 있다.
          데크, 덱 등으로 부른다.

    - 메서드
        offerFirst()    > 앞에 추가
        offerLast()     > 뒤에 추가
        pollFirst()     > 앞에서 꺼냄
        pollLast()      > 뒤에서 꺼냄 
*/
