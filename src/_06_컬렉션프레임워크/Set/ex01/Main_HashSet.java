package _06_컬렉션프레임워크.Set.ex01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main_HashSet {
    public static void main(String[] args) {

        Integer[] inputArr = { 30, 20, 20, 10, 10 };

        List<Integer> list = List.of(inputArr);     // 배열을 컬렉션으로 반환

        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);

        // 배열 -> 컬렉션
        List<Integer> list1 = Arrays.asList(1, 2, 3);   // jdk1.2 ~
        List<Integer> list2 = List.of(1, 2, 3);         // jdk9 ~
    }


}
