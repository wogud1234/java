package _06_컬렉션프레임워크.Set.step02_정수해시코드로중복해결;

import java.util.Arrays;

public class M01_단순인덱스사용 {
    public static void main(String[] args) {

        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("Arrays.toString(inputArray) = " + Arrays.toString(inputArray));

        int serchValue = 99;
        Integer result = inputArray[serchValue];        // O(1)
        System.out.println("result = " + result);
    }
}

/*
    - 데이터의 값을 인덱스 번호로 사용하는 아주 간단한 아이디어 하나로 O(n)의 검색 연산을 O(1)의 검색 연산으로 바꿀 수 있다.
    - 단점
        : 입력 값의 범위 만큼 큰 배열을 사용해야 한다.    -> 메모리 낭비..
        : 데이터의 값을 인덱스로 사용하는 방법은 매우 빠른 성능을 보장하지만, 입력 값의 범위가 조금만 커져도 메모리 낭비가 너무 심하다.
          따라서 그대로 사용하기에는 문제가 있다.
*/