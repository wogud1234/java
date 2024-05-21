package _06_컬렉션프레임워크.app.ex01;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

// 값으로 검색
public class Main04 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1000)) {
                list.add(entry.getKey());
            }
        }
        System.out.println(list);
    }
}
