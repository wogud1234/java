package _06_컬렉션프레임워크.ArrayList.step03_리스트추상화_인터페이스;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public ArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        if(size == elementData.length)
            grow();
        elementData[size] = e;
        size++;
    }

    @Override
    public void add(int index, E e) {
        if(size == elementData.length)
            grow();
        for (int i = 0; i < size - index ; i++) {
            elementData[size-i] = elementData[size-i-1];
        }
        elementData[index] = e;
        size++;
    }

    @Override
    public E remove(int index) {
        E oldValue = get(index);
        for (int i = 0; i < size-index-1; i++) {
            elementData[index+i] = elementData[index+i+1];
        }
        elementData[size] = null;
        size--;

        return oldValue;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E)elementData[index];
    }

    @Override
    public E set(int index, Object element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
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