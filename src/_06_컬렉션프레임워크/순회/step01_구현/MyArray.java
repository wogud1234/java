package _06_컬렉션프레임워크.순회.step01_구현;

import java.util.Iterator;

// Iterable을 구현함으로써 반복 가능함을 나타낸다.
public class MyArray implements Iterable<Integer> {

    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    // 반복자를 구현해서 반환한다.
    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
