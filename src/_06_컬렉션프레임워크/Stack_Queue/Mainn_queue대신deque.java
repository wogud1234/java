package _06_컬렉션프레임워크.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Mainn_queue대신deque {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();
        //데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);
        //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());
        //데이터 꺼내기
        System.out.println("poll = " + deque.poll());
        System.out.println("poll = " + deque.poll());
        System.out.println("poll = " + deque.poll());
        System.out.println(deque);
    }
}
/*
    - Deque 에서 Queue 을 위한 메서드 이름까지 제공하는 것을 확인할 수 있다.
      Deque 인터페이스는 Queue 인터페이스의 자식이기 때문에, 단순히 Queue 의 기능만 필요하면 Queue 인터페이스를 사용하고,
      더 많은 기능이 필요하다면 Deque 인터페이스를 사용하면 된다. 그리고 구현체로 성능이 빠른 ArrayDeque 를 사용하자.
*/