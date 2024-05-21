package _06_컬렉션프레임워크.Set.step03_HashSet구현1;

public class Main {
    public static void main(String[] args) {

        HashSet set = new HashSet(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);

        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);

        boolean removeResult = set.remove(searchValue);
        System.out.println(set);

    }
}
