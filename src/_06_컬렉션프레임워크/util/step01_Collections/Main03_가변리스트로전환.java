package _06_컬렉션프레임워크.util.step01_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main03_가변리스트로전환 {
    public static void main(String[] args) {

        // 불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);

        // 불변 리스트 -> 가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(4);
        System.out.println("mutableList = " + mutableList);
        System.out.println("mutableList.getClass() = " + mutableList.getClass());

        // 가변 리스트 -> 불변 리스트
        List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("unmodifiableList.getClass() = " + unmodifiableList.getClass());
//        unmodifiableList.add(5);  // error)
    }
}
