package _06_컬렉션프레임워크.Map.step01_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main02 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("studentA", 100);
        map.put("studentA", 90);        // 같은 키에 저장시 기존 값 교체

        boolean containsKey = map.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        map.remove("studentB");
        System.out.println(map);

        // 학생이 없는 경우에만 추가1
        if(!map.containsKey("studentA"))
            map.put("studentA", 0);
        System.out.println(map);

        // 학생이 없는 경우에만 추가2
        map.putIfAbsent("studentA", 0);
        System.out.println(map);
    }
}
