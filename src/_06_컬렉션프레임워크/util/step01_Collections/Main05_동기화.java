package _06_컬렉션프레임워크.util.step01_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main05_동기화 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list.getClass() = " + list.getClass());
        
        List<Integer> synchronizedList = Collections.synchronizedList(list);
        System.out.println("synchronizedList.getClass() = " + synchronizedList.getClass());
    }
}

/*
    - Collections.synchronizedList 를 사용하면 일반 리스트를 멀티스레드 상황에서 동기화 문제가 발생하지 않는 안전한 리스트로 만들 수 있다.
      동기화 작업으로 인해 일반 리스트보다 성능은 더 느리다.
*/