package _06_컬렉션프레임워크.util.step01_Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main02_불변리스트 {
    public static void main(String[] args) {

        // 편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list class = " + list.getClass());
        System.out.println("set class = " + set.getClass());
        System.out.println("map class = " + map.getClass());
    }
}
