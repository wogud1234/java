package _06_컬렉션프레임워크.Set.ex02;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main_01 {
    public static void main(String[] args) {

        Set<Integer> A = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> B = new HashSet<>(List.of(3, 4, 5, 6, 7));

        //System.out.println(getHab(A, B));
        //System.out.println(getKyo(A, B));
        //System.out.println(getChar(A, B));

        Set<Integer> union = new HashSet<>(A);
        union.addAll(B);

        Set<Integer> intersection = new HashSet<>(A);
        intersection.retainAll(B);      // A에 있는거랑 겹치는 것만 남기고 다 지우기

        Set<Integer> difference = new HashSet<>(A);
        difference.removeAll(B);        // A에 있는거 중에서 B에 있는거 지우기

        System.out.println("합집합: " + union);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);
    }

    private static Set<Integer> getHab(Set<Integer> a, Set<Integer> b) {
        Set<Integer> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);
        return set;
    }
    private static Set<Integer> getKyo(Set<Integer> a, Set<Integer> b) {
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> iterator = a.iterator();
        while(iterator.hasNext()) {
            Integer num = iterator.next();
            if(b.contains(num)) {
                set.add(num);
            }
        }
        return set;
    }
    private static Set<Integer> getChar(Set<Integer> a, Set<Integer> b) {
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> iterator = a.iterator();
        while(iterator.hasNext()) {
            Integer num = iterator.next();
            if(!(b.contains(num))) {
                set.add(num);
            }
        }
        return set;
    }
}
