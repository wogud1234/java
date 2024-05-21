package _06_컬렉션프레임워크.Set.step06_HashSet구현2.equals_hashCode구현안하면;

import _06_컬렉션프레임워크.Set.step06_HashSet구현2.HashSet;

public class MemberOnlyHash_Main {
    public static void main(String[] args) {

        //중복 등록
        HashSet set = new HashSet(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " +
                searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }

}

/*
    1. 저장 문제
        : hashCode() 를 재정의했기 때문에 같은 id 를 사용하는 m1 , m2 는 같은 해시 코드를 사용한다.
          따라서 같은 해시 인덱스에 데이터가 저장된다.
          그런데 MemberOnlyHash 는 equals() 를 재정의하지 않았으므로 Object 의 equals() 를 상속 받아서 사용한다.
          따라서 인스턴스의 참조값을 비교하므로, 인스턴스가 서로 다른 m1 , m2 는 비교에 실패한다.
          add() 로직은 중복 데이터가 없다고 생각하고 m1 , m2 를 모두 저장한다.
          결과적으로 같은 회원 id 를 가진 중복 데이터가 저장된다.

    2. 검색 문제
        : MemberOnlyHash 는 equals() 를 재정의하지 않았으므로 Object 의 equals() 를 상속 받아서 사용한다.
          따라서 인스턴스의 참조값을 비교한다. 인스턴스가 서로 다른 searchValue 와 m1 , m2 는 비교에 실패한다.
          결과적으로 데이터를 찾을 수 없다.
*/