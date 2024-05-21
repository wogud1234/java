package _06_컬렉션프레임워크.Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Mainn_stack대신deque {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();
        // 데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);
        // 다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());
        // 데이터 꺼내기
        System.out.println("pop = " + deque.pop());
        System.out.println("pop = " + deque.pop());
        System.out.println("pop = " + deque.pop());
        System.out.println(deque);
    }
}
/*
    - Deque 는 양쪽으로 데이터를 입력하고 출력할 수 있으므로, 스택과 큐의 역할을 모두 수행할 수 있다.
      Deque 를 Stack 과 Queue 로 사용하기 위한 메서드 이름까지 제공한다.

    - Deque 에서 Stack 을 위한 메서드 이름까지 제공하는 것을 확인할 수 있다.
      자바의 Stack 클래스는 성능이 좋지 않고 하위 호환을 위해서 남겨져 있다.
      Stack 자료 구조가 필요하면 Deque 에 ArrayDeque 구현체를 사용하자.
*/