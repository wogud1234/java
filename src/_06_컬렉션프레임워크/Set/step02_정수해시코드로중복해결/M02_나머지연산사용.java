package _06_컬렉션프레임워크.Set.step02_정수해시코드로중복해결;

import java.util.Arrays;

public class M02_나머지연산사용 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        // { 1, 2, 5, 8, 14, 99 }

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));
        
        // 검색
        int searchValue = 14;
        int hashIndex = hashIndex((searchValue));
        Integer result = inputArray[hashIndex];        // O(1)
        System.out.println("hashIndex = " + hashIndex);
        System.out.println("result = " + result);
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }
}

/*
    - 나머지 연산
        : 공간도 절약하면서, 넓은 범위의 값을 사용할 수 있는 방법이 있는데, 바로 나머지 연산을 사용하는 것이다.
          저장할 수 있는 배열의 크기(CAPACITY)를 10이라고 가정하자. 그 크기에 맞추어 나머지 연산을 사용하면 된다.
                1 % 10 = 1
                2 % 10 = 2
                5 % 10 = 5
                8 % 10 = 8
                14 % 10 = 4
                99 % 10 = 9
          여기서 14, 99는 10보다 큰 값이다. 따라서 일반적인 방법으로는 크기가 10인 배열의 인덱스로 사용할 수 없다.
          하지만 나머지 연산의 결과를 사용하면 14는 4로, 99는 9로 크기가 10인 배열의 인덱스로 활용할 수 있다.
          나머지 연산의 결과는 절대로 배열의 크기를 넘지 않는다. 예를 들어 나머지 연산에 10을 사용하면 결과는 0~9 까지만나온다.
          절대로 10이 되거나 10을 넘지 않는다.
          따라서 연산 결과는 배열의 크기를 넘지 않으므로 안전하게 인덱스로 사용할 수 있다.

    - 해시 인덱스
        : 이렇게 배열의 인덱스로 사용할 수 있도록 원래의 값을 계산한 인덱스를 해시 인덱스(hashIndex)라 한다.
          14의 해시 인덱스는 4, 99의 해시 인덱스는 9이다

    - 정리
        : 입력 값의 범위가 넓어도 실제 모든 값이 들어오지는 않기 때문에 배열의 크기를 제한하고, 나머지 연산을 통해 메모리가 낭비되는 문제도 해결할 수 있다.
          해시 인덱스를 사용해서 O(1)의 성능으로 데이터를 저장하고, O(1)의 성능으로 데이터를 조회할 수 있게 되었다.
          덕분에 자료 구조의 조회 속도를 비약적으로 향상할 수 있게 되었다.

    - 한계 -> 해시 충돌
        : 저장할 위치가 충돌할 수 있다는 한계가 있다.
          예를 들어 1, 11의 두 값은 이렇게 10으로 나누면 같은 값 1이 된다. 둘다 같은 해시 인덱스가 나와버리는 것이다.
        :  다른 값을 입력했지만 같은 해시 코드가 나오게 되는데 이것을 해시 충돌이라 한다.
                1 % 10 = 1
                11 % 10 = 1
                99 % 10 = 9
                9 % 10 = 9
*/