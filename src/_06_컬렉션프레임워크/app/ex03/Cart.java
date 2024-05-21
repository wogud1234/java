package _06_컬렉션프레임워크.app.ex03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    Map<Product, Integer> map;

    public Cart() {
        map = new HashMap<>();
    }

    public void add(Product product, Integer amount) {
        /*if(map.containsKey(product))
            amount += map.get(product);
        map.put(product, amount);*/
        int currentAmount = map.getOrDefault(product, 0);
        map.put(product, currentAmount + amount);
    }

    public void minus(Product product, Integer amount) {
        int currentAmount = map.getOrDefault(product, 0);
        int newAmount = currentAmount - amount;
        if(newAmount <= 0)
            map.remove(product);
        else
            map.put(product, newAmount);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        Set<Map.Entry<Product, Integer>> entrys = map.entrySet();
        for (Map.Entry<Product, Integer> entry : entrys) {
            System.out.println("상품: " + entry.getKey() + ", 수량: " + entry.getValue());
        }
        System.out.println();
    }


}
