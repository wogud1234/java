package _06_컬렉션프레임워크.정렬.step02_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("a", 30);
        User user2 = new User("b", 20);
        User user3 = new User("c", 10);

        User[] users = {user1, user2, user3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(users));

        System.out.println("Comparable 기본 정렬");
        Arrays.sort(users);                             // User클래스에서 오버라이딩한 compareTo()가 정렬 기준이 된다.
        System.out.println(Arrays.toString(users));

        System.out.println();

        System.out.println("IdComparator 정렬");
        Arrays.sort(users, new IdComparator());
        System.out.println(Arrays.toString(users));
    }
}

/*
    - Comparable, Comparator 정리
        : 객체의 기본 정렬 방법은 객체에 Comparable 를 구현해서 정의한다.
          이렇게 하면 객체는 이름 그대로 비교할 수 있는 객체가 되고 기본 정렬 방법을 가진다.
          그런데 기본 정렬 외에 다른 정렬 방법을 사용해야 하는 경우 비교자 ( Comparator )를 별도로 구현해서 정렬 메서드에 전달하면 된다.
          이 경우 전달한 Comparator 가 항상 우선권을 가진다.
          자바가 제공하는 Integer , String 같은 기본 객체들은 대부분 Comparable 을 구현해 두었다.
*/