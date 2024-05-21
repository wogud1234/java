package _06_컬렉션프레임워크.Set.step06_HashSet구현2.equals_hashCode구현안하면;

public class MemberNoHashNoEq {

    private String id;
    public MemberNoHashNoEq(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}

/*
    - 해시 자료 구조를 사용하려면 hashCode() 도 중요하지만, 해시 인덱스가 충돌할 경우를 대비에서 equals() 도 반드시 재정의해야 한다.
      해시 인덱스가 충돌할 경우 같은 해시 인덱스에 있는 데이터들을 하나하나 비교해서 찾아야한다.
      이때 equals() 를 사용해서 비교한다.
      해시 인덱스가 같아도 실제 저장된 데이터는 다를 수 있다.
      따라서 특정 인덱스에 데이터가 하나만 있어도 equals()로 찾는 데이터가 맞는지 검증해야 한다.

    - Object의 기본 기능
        : hashCode()
            > 객체의 참조값을 기반으로 해시 코드를 반환한다.
        : equals()
            > 동일성 비교(==)를 한다. 따라서 객체의 참조값이 같아야 true 를 반환한다.
              클래스를 만들 때 hashCode() , equals() 를 재정의하지 않으면,
              해시 자료 구조에서 Object 가 기본으로 제공하는 hashCode() , equals() 를 사용하게 되는데,
              이 때 문제는 Object 가 기본으로 제공하는 기능은 단순히 인스턴스의 참조를 기반으로 작동한다는 것이다.
*/