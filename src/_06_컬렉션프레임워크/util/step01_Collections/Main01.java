package _06_컬렉션프레임워크.util.step01_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("list = " + list);
        System.out.println();

        System.out.println("Collections.max(list) = " + Collections.max(list));
        System.out.println("Collections.min(list) = " + Collections.min(list));

        Collections.shuffle(list);
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("list = " + list);

        Collections.reverse(list);
        System.out.println("list = " + list);


    }
}
