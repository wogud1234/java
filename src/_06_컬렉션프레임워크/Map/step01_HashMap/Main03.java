package _06_컬렉션프레임워크.Map.step01_HashMap;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main03 {
    public static void main(String[] args) {

        run(new HashMap<>());           // 순서x                                  O(1)
        run(new LinkedHashMap<>());     // 입력한 순서                             O(1)
        run(new TreeMap<>());           // 키 자체의 데이터 값을 기준으로 정렬       O(logN)
    }
    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.print(key + "=" + value + " / ");
        }
        System.out.println();
    }
}
