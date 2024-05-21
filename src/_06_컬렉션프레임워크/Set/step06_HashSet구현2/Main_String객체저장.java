package _06_컬렉션프레임워크.Set.step06_HashSet구현2;

public class Main_String객체저장 {
    public static void main(String[] args) {

        HashSet set = new HashSet(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);
        System.out.println("A.hashCode=" + "A".hashCode());
        System.out.println("B.hashCode=" + "B".hashCode());
        System.out.println("AB.hashCode=" + "AB".hashCode());
        System.out.println("SET.hashCode=" + "SET".hashCode());
        //검색
        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}

/*
    - 자바의 String 은 hashCode() 를 재정의해 두었다. 우리는 이 값을 사용하면 된다.
      hashIndex(Object value) 에서 value.hashCode() 를 호출하면 실제로는 String 에서 재정의한 hashCode() 가 호출된다.
      이렇게 반환된 해시 코드를 기반으로 해시 인덱스를 생성한다.
      참고로 자바의 해시 함수는 단순히 문자들을 더하기만 하는 것이 아니라 더 복잡한 연산을 사용해서 해시 코드를 구한다.
*/