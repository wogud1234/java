package _06_컬렉션프레임워크.순회.step01_구현;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("==iterator 사용==");
        while(iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
        System.out.println();

        System.out.println("for-each 사용");
        for (Integer value : myArray) {
            System.out.println("value = " + value);
        }
    }
}

/*
    - for-each를 사용하려면 배열이거나, 조회 대상 객체가 iterable을 구현해야 한다.
    - iterable을 구현한 객체는 iterator()를 오버라이딩 해서 Iterator를 구현한 객체를 반환한다.
*/
