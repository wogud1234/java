package _06_컬렉션프레임워크.util.step01_Collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main04_빈리스트 {
    public static void main(String[] args) {

        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // 빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList();  // 자바5
        List<Integer> list4 = List.of();                // 자바9
        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        System.out.println();

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = { 1, 2, 3 };
        List<Integer> arrList = Arrays.asList(arr);     // 배열 arr을 그대로 사용한다.                        -> 애매한 가변
        List<Integer> arr1 = List.of(arr);              // 배열 arr을 내부에서 새로운 리스트로 만든 후 사용한다. -> 가변
    }
}

/*
    - Arrays.asList() 로 생성된 리스트는 고정된 크기를 가지지만, 요소들은 변경할 수 있다.
      즉, 리스트의 길이는 변경할 수 없지만, 기존 위치에 있는 요소들을 다른 요소로 교체할 수 있다.
      set() 을 통해 요소를 변경할 수 있다.
      add() , remove() 같은 메서드를 호출하면 예외가 발생한다. 크기를 변경할 수 없다.
      (java.lang.UnsupportedOperationException 발생)
      고정도 가변도 아닌 애매한 리스트이다.

    - 정리하면 일반적으로 List.of() 를 사용하는 것을 권장한다. 다음과 같은 경우 Arrays.asList() 를 선택할 수있다.
        > 변경 가능한 요소: 리스트 내부의 요소를 변경해야 하는 경우(단, 리스트의 크기는 변경할 수 없음).
        > 하위 호환성: Java 9 이전 버전에서 작업해야 하는 경우
*/