package _06_컬렉션프레임워크.Map.step01_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {

        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println("studentMap = " + studentMap);

        Integer score = studentMap.get("studentA");

        System.out.println("\nkeySet 활용");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            System.out.println("[" + key + "-" + studentMap.get(key) + "]");
        }

        System.out.println("\nvalues 활용");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("\nentrySet 활용");
        Set<Map.Entry<String, Integer>> entrySet = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("[" + key + "-" + studentMap.get(key) + "]");
        }
    }
}
