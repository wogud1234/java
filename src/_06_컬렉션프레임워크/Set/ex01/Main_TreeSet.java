package _06_컬렉션프레임워크.Set.ex01;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main_TreeSet {
    public static void main(String[] args) {

        Integer[] inputArr = { 30, 20, 20, 10, 10 };

        Set<Integer> set = new TreeSet<>(List.of(inputArr));

        System.out.println(set);
    }
}
