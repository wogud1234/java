package _06_컬렉션프레임워크.Set.step07_제네릭추가;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(10);
        Set<Integer> set2 = new HashSet<>(10);

        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        // 검색
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

    }
}
