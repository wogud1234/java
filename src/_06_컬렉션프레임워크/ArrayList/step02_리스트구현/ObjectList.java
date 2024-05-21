package _06_컬렉션프레임워크.ArrayList.step02_리스트구현;

import java.util.Arrays;

public class ObjectList {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public ObjectList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public ObjectList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if(size == elementData.length)
            grow();
        elementData[size] = e;
        size++;
    }

    public void add(int index, Object e) {
        if(size == elementData.length)
            grow();
        for (int i = 0; i < size - index ; i++) {
            elementData[size-i] = elementData[size-i-1];
        }
        elementData[index] = e;
        size++;
    }

    public Object remove(int index) {
        Object oldValue = get(index);
        for (int i = 0; i < size-index-1; i++) {
            elementData[index+i] = elementData[index+i+1];
        }
        elementData[size] = null;
        size--;

        return oldValue;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for(int i=0 ; i<size ; i++) {
            if(o.equals(elementData[i]))
                return i;
        }
        return -1;
    }

    private void grow() {

        //Object[] newArr = new Object[elementData.length * 2];
        //System.arraycopy(elementData, 0, newArr, 0, elementData.length);

        Object[] newArr = Arrays.copyOf(elementData, elementData.length * 2);       // 이게 더 편함.
        elementData = newArr;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size=" + size + ", capacity=" + elementData.length;

        // [1,2,3,null,null] -> [1,2,3]
    }
}

/*
    - Arrays.copyOf(elementData, size)
        : 배열 elementData의 내용을 size만큼만 복사한 새로운 배열을 만들어서 바환하는데,
          elementData의 길이가 size보다 작다면, 새로운 배열은 elementData의 내용을 복사하고, 남은 부분은 기본값으로 채워집니다.
          만약 elementData의 길이가 size보다 크다면, size에 맞게 잘린 배열이 반환됩니다.
*/