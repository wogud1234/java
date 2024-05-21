package _06_컬렉션프레임워크.Set.step01_정수값과인덱스일치;

import java.util.Arrays;

public class Set {
    
    private int[] elementData = new int[10];
    private int size = 0;
    
    public boolean add(int value) {
        
        if(isContains(value))
            return false;
        
        elementData[size] = value;
        size++;
        
        return true;
    }

    public boolean isContains(int value) {      // O(n)
        for(int data : elementData) {
            if(data == value)
                return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Set{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
