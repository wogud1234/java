package _06_컬렉션프레임워크.Set.step06_HashSet구현2;

public class Main_직접만든객체저장 {
    public static void main(String[] args) {

        HashSet set = new HashSet(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA"); //대문자 주의!
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());
        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        //검색
        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}
/*
    - Member 의 hashCode() 를 id 값을 기반으로 재정의해 두었다.
      hashIndex(Object value) 에서 value.hashCode() 를 호출하면 실제로는 Member 에서 재정의한 hashCode() 가 호출된다.
      이렇게 반환된 해시 코드를 기반으로 해시 인덱스를 생성한다.

    - equals()는 언제 사용할까?

buckets=[[Member{id='hi'}, Member{id='JPA'}], [], [], [], [], [], [Member{id='spring'}], [], [], [Member{id='java'}]]

        : "JPA"를 조회할 때 해시 인덱스는 0이다. 따라서 배열의 0 번 인덱스를 조회한다.
          여기에는 [hi, JPA] 라는 회원 두 명이 있다. 이것을 하나하나 비교해야 한다.
          이때 equals() 를 사용해서 비교한다.
          따라서 해시 자료 구조를 사용할 때는 hashCode() 는 물론이고, equals() 도 반드시 재정의해야 한다.
          참고로 자바가 제공하는 기본 클래스들은 대부분 hashCode() , equals() 를 함께 재정의해 두었다.
*/