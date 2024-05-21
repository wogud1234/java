package _06_컬렉션프레임워크.Set.step03_HashSet구현1;

import java.util.Arrays;
import java.util.LinkedList;
public class HashSet {

    public static final int DEFUALT_INITIAL_CAPACITY = 16;

    public LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFUALT_INITIAL_CAPACITY;

    public HashSet() {
        initBuckets();
    }
    public HashSet(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];    // O(1)
        return bucket.contains(searchValue);                // 원래 O(n)이지만 여기에는 데이터가 많이 안 들어있을 거여서 O(1)임...
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];    // O(1)
        if(bucket.contains(value))                          // 원래 O(n)이지만 여기에는 데이터가 많이 안 들어있을 거여서 O(1)임...
            return false;

        bucket.add(value);
        size++;

        return true;
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];

        //bucket.remove(value);                                       // index 자리에 있는 값을 지움
        boolean result = bucket.remove(Integer.valueOf(value));       // 값을 비교해서 지움

        if(result) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    @Override
    public String toString() {
        return "HashSet{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}

/*
    - HashSet은 해시 알고리즘을 사용한 덕분에 등록, 검색, 삭제 모두 평균 O(1)로 연산 속도를 크게 개선했다.

    - 남은 문제
        : 해시 인덱스를 사용하려면 데이터의 값을 배열의 인덱스로 사용해야 한다.
          그런데 배열의 인덱스는 0, 1, 2 같은 숫자만 사용할 수 있다.
          "A", "B"와 같은 문자열은 배열의 인덱스로 사용할 수 없다.
          숫자가 아닌 문자열 데이터를 저장할 때, 해시 인덱스를 사용하려면 어떻게 해야할까????
*/