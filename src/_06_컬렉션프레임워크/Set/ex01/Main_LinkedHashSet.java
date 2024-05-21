package _06_컬렉션프레임워크.Set.ex01;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main_LinkedHashSet {
    public static void main(String[] args) {

        Integer[] inputArr = { 30, 20, 20, 10, 10 };

        Set<Integer> set = new LinkedHashSet<>();

        for (Integer i : inputArr) {
            set.add(i);
        }
        System.out.println(set);
    }
}
