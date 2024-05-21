package _06_컬렉션프레임워크.Set.step08_자바의HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();                  // 무작위로 저장                          O(1)
        Set<String> linkedHashSet = new LinkedHashSet<>();      // 입력한 순서로 저장                     O(1)
        Set<String> treeSet = new TreeSet<>();                  // 데이터를 기준으로 오름차순으로 저장      O(logN)

        run(hashSet);
        run(linkedHashSet);
        run(treeSet);
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        //System.out.println("set = " + set);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }
}
