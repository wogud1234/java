package _06_컬렉션프레임워크.순회.step02_자바제공;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println();

        printAll(list.iterator());
        System.out.println();
        foreach(list);

        System.out.println();

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        System.out.println();
        foreach(set);
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void foreach(Iterable<Integer> iterable) {
        // Iterable
        System.out.println("iterable.getClass() = " + iterable.getClass());
        for (Integer i : iterable) {        // for-each 문으로는 iterable을 구현한 객체들만 조회할 수 있다.
            System.out.println(i);
        }
    }
}
