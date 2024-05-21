package _06_컬렉션프레임워크.정렬.step04_트리구조정렬;

import _06_컬렉션프레임워크.정렬.step02_comparable.IdComparator;
import _06_컬렉션프레임워크.정렬.step02_comparable.User;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("a", 30);
        User user2 = new User("b", 20);
        User user3 = new User("c", 10);

        TreeSet<User> treeSet = new TreeSet<>();                    // 데이터를 정렬하면서 넣음.
        treeSet.add(user1);
        treeSet.add(user2);
        treeSet.add(user3);
        System.out.println("==Comparable 기본 정렬==");
        System.out.println("treeSet = " + treeSet);
        System.out.println();

        TreeSet<User> treeSet2 = new TreeSet<>(new IdComparator());     // 넣기 전에 비교자 제공해야됨.
        treeSet2.add(user1);
        treeSet2.add(user2);
        treeSet2.add(user3);
        System.out.println("==IdComparator 정렬==");
        System.out.println("treeSet2 = " + treeSet2);
        System.out.println();
    }
}
