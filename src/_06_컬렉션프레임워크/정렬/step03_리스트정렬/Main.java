package _06_컬렉션프레임워크.정렬.step03_리스트정렬;

import _06_컬렉션프레임워크.정렬.step02_comparable.IdComparator;
import _06_컬렉션프레임워크.정렬.step02_comparable.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("a", 30);
        User user2 = new User("b", 20);
        User user3 = new User("c", 10);
        
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user3);
        list.add(user1);

        System.out.println("==기본 데이터==");
        System.out.println("list = " + list);

        System.out.println();

        System.out.println("==Comparable 기본 정렬==");
        list.sort(null);
        System.out.println("list = " + list);

        System.out.println();

        System.out.println("==IdComparator 정렬==");
        list.sort(new IdComparator());
        System.out.println("list = " + list);

        System.out.println();

        Collections.sort(list);                             // 이렇게도 가능
        Collections.sort(list, new IdComparator());
    }
}
/*
    - Collections.sort(list)
        : 리스트는 순서가 있는 컬렉션이므로 정렬할 수 있다.
          이 메서드를 사용하면 기본 정렬이 적용된다.
          하지만 이 방식보다는 객체 스스로 정렬 메서드를 가지고 있는 list.sort() 사용을 더 권장한다.
          참고로 둘의 결과는 같다.

    - list.sort(null)
        : 별도의 비교자가 없으므로 Comparable 로 비교해서 정렬한다.
          자연적인 순서로 비교한다.
          자바 1.8 부터 사용

    - Collections.sort(list, new IdComparator())
        : 별도의 비교자로 비교하고 싶다면 다음 인자에 비교자를 넘기면 된다.
          하지만 이 방식보다는 객체 스스로 정렬 메서드를 가지고 있는 list.sort() 사용을 더 권장한다.
          참고로 둘의 결과는 같다.

    - list.sort(new IdComparator())
        : 전달한 비교자로 비교한다.
          자바 1.8 부터 사용
*/