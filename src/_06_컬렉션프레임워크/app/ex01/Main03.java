package _06_컬렉션프레임워크.app.ex01;

import java.util.Map;
import java.util.HashMap;

// 각 단어가 나타난 수
public class Main03 {
    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();
        String[] words = text.split(" ");

        for (String word : words) {
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(word, count);
        }

        System.out.println(map);
    }
}
