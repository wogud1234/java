package _06_컬렉션프레임워크.ArrayList.step02_리스트구현;

public class ObjectList_Main {
    public static void main(String[] args) {

        ObjectList list = new ObjectList();

        System.out.println("===데이터 추가===");

        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        list.add(3);
        System.out.println(list);

        System.out.println("===기능 사용===");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf(\"c\") = " + list.indexOf("c"));
        System.out.println("list.set(2, \"z\") = " + list.set(2, "z"));
        System.out.println();
        System.out.println(list);

        System.out.println("===용량 초과===");
        list.add("d");
        System.out.println(list);
        list.add("e");
        System.out.println(list);

        System.out.println("===중간에 추가===");
        System.out.println(list);
        list.add(2, "q");
        System.out.println(list);
        list.add(0, "q");
        System.out.println(list);

        System.out.println("===삭제===");
        list.remove(2);
        System.out.println(list);
        list.remove(6);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        list.add(5);
        System.out.println(list);
    }
}
