package _06_컬렉션프레임워크.ArrayList.step02_리스트구현;

import java.util.Arrays;

public class GenericList<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public GenericList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public GenericList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(E e) {
        if(size == elementData.length)
            grow();
        elementData[size] = e;
        size++;
    }

    public void add(int index, E e) {
        if(size == elementData.length)
            grow();
        for (int i = 0; i < size - index ; i++) {
            elementData[size-i] = elementData[size-i-1];
        }
        elementData[index] = e;
        size++;
    }

    public E remove(int index) {
        E oldValue = get(index);
        for (int i = 0; i < size-index-1; i++) {
            elementData[index+i] = elementData[index+i+1];
        }
        elementData[size] = null;
        size--;

        return oldValue;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E)elementData[index];
    }

    public E set(int index, Object element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(E o) {
        for(int i=0 ; i<size ; i++) {
            if(o.equals(elementData[i]))
                return i;
        }
        return -1;
    }

    private void grow() {
        Object[] newArr = Arrays.copyOf(elementData, elementData.length * 2);       // 이게 더 편함.
        elementData = newArr;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size=" + size + ", capacity=" + elementData.length;
    }
}

/*
    - Object[] elementData를 그대로 사용하는 이유
        : 제네릭은 런타임에 이레이저에 의해 타입 정보가 사라진다.
          따라서 런타임에 타입 정보가 필요한 생성자에 사용할 수 없다.
          따라서 제네릭을 기반으로 배열을 생성하는 코드는 작동하지 않고, 컴파일 오류가 발생한다.
          이것은 자바가 제공하는 제네릭의 한계이다.
            new E[DEFAULT_CAPACITY];        x

        : 대신에 모든 데이터를 담을 수 있는 Object를 그대로 사용해야 한다.
            new Object[DEFAULT_CAPACITY];   o

        : Object 배열을 사용하더라도 이 배열에는 타입 매개변수 E에 의해서 한 가지 특정 타입의 데이터만 들어오고, 나가기 때문에
          아무런 문제가 되지 않는다.
          (그래서 E로 캐스팅 해서 리턴해도 문제가 되지 않는다.)
*/