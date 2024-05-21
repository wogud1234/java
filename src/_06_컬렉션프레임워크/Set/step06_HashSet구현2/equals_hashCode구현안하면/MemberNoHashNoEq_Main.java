package _06_컬렉션프레임워크.Set.step06_HashSet구현2.equals_hashCode구현안하면;

import _06_컬렉션프레임워크.Set.step06_HashSet구현2.HashSet;

public class MemberNoHashNoEq_Main {
    public static void main(String[] args) {

        //중복 등록
        HashSet set = new HashSet(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());

        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}

/*
    1. 데이터 저장 문제
        : m1 과 m2 의 해시 코드가 서로 다르기 때문에 다른 위치에 각각 저장된다.
          회원 id가 "A"로 같은 회원의 데이터가 데이터가 중복 저장된다.

    2. 데이터 검색 문제
        : MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A")
         회원 id가 "A"인 객체를 검색하기 위해 회원 id가 "A"인 객체를 만들었다.
         데이터를 검색할 때 searchValue 객체의 해시 코드는 참조값을 기반으로 나온 값이다.
         따라서 다른 위치에서 데이터를 찾게 되고, 검색에 실패한다.
*/