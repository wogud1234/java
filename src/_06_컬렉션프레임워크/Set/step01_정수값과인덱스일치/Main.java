package _06_컬렉션프레임워크.Set.step01_정수값과인덱스일치;

public class Main {
    public static void main(String[] args) {

        Set set = new Set();
        set.add(1); // O(1)
        set.add(2); // O(n)
        set.add(3); // O(n)
        set.add(4); // O(n)
        set.add(5); // O(n)

        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.isContains(3) = " + set.isContains(3));     // O(n)
        System.out.println("set.isContains(99) = " + set.isContains(99));   // O(n)
    }
}
