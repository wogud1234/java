package _06_컬렉션프레임워크.Set.step02_정수해시코드로중복해결;

import java.util.Arrays;
import java.util.LinkedList;

public class M03_해시충돌해결 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // { 1, 2, 5, 8, 14, 99 }

        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        System.out.println("buckets = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        System.out.println("buckets = " + Arrays.toString(buckets));
        
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9);
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean result = isContains(buckets, searchValue);
        System.out.println("buckets.isContains(" + searchValue + ") = " + result);
    }

    private static void add(LinkedList<Integer>[] buckets, int value) {

        int hashInedex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashInedex];   // O(1)
        if(!bucket.contains(value))     // O(n)
            bucket.add(value);
    }

    private static boolean isContains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];    // O(1)

        return bucket.contains(searchValue);                // O(n)
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

/*
    - 해시 충돌 해결
        : 해시 충돌을 인정하면 문제 해결의 실마리가 보인다.
          해시 충돌은 낮은 확률로 일어날 수 있다고 가정하는 것이다.
          해결 방안은 바로 해시 충돌이 일어났을 때 단순하게 같은 해시 인덱스의 값을 같은 인덱스에 함께 저장해버리는 것이다.
          물론 여러 데이터를 배열의 하나의 공간에 함께 저장할 수는 없다. 대신에 배열 안에 배열을 만들면 된다.
          물론 배열 안에 리스트 같은 다른 자료구조를 사용해도 된다.

        : 조회 시 해시 충돌이 난 경우 내부의 데이터를 하나씩 비교해보면 원하는 결과를 찾을 수 있다.

        : 해시 인덱스를 사용하는 방식은 최악의 경우 O(n)의 성능을 보인다.
          하지만 확률적으로 보면 어느 정도 넓게 퍼지기 때문에 평균으로 보면 대부분 O(1)의 성능을 제공한다.
          해시 충돌이 가끔 발생해도 내부에서 값을 몇 번만 비교하는 수준이기 때문에 대부분의 경우 매우 빠르게 값을 찾을 수 있다.

    - 해시 인덱스 충돌 확률
        : 해시 충돌이 발생하면 데이터를 추가하거나 조회할 때, 연결 리스트 내부에서 O(n)의 추가 연산을 해야 하므로 성능이 떨어진다.
          따라서 해시 충돌은 가급적 발생하지 않도록 해야 한다.
          해시 충돌이 발생할 확률은 입력하는 데이터의 수와 배열의 크기와 관련이 있다.
          입력하는 데이터의 수와 비교해서 배열의 크기가 클 수록 충돌 확률은 낮아진다.

    - 정리
        : 해시 인덱스를 사용하는 경우

            [데이터 저장]
                > 평균: O(1)
                > 최악: O(n)

            [데이터 조회]
                > 평균: O(1)
                > 최악: O(n)
*/