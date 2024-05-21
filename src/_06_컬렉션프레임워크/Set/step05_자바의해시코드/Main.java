package _06_컬렉션프레임워크.Set.step05_자바의해시코드;

public class Main {
    public static void main(String[] args) {

        // Object의 기본 hashCode는 객체의 참조값을 기반으로 생성된다.
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());     // 1313922862   <- 객체의 참조값
        System.out.println("obj2.hashCode() = " + obj2.hashCode());     // 122883338
        System.out.println(obj1);                                       // java.lang.Object@4e50df2e    <- 객체의 참조값을 16진수로 출력
        System.out.println(obj2);                                       // java.lang.Object@7530d0a
        System.out.println(Integer.toHexString(obj1.hashCode()));       // 4e50df2e                     <- 10진수를 16진수로 변경해서 출력
        System.out.println(Integer.toHexString(obj2.hashCode()));       // 7530d0a

        // 자바가 제공하는 클래스들은 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";
        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'B'.hashCode() = " + strAB.hashCode());

        // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("Integer.valueOf(-1).hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까?  인스턴스는 다르지만, equals는 같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        // equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우를 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("(member1 equals member2) = " + (member1.equals(member2)));
        System.out.println();
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
        // Member클래스의 hashCode()를 오버라이딩 안 하면 위 두 값은 다르게 나온다.
    }
}

/*
    - 해시 인덱스를 사용하는 해시 자료 구조는 데이터 추가, 검색, 삭제의 성능이 O(1)로 매우 빠르기 때문에 많은 곳에서 자주 사용된다.
      그런데 해시 자료 구조를 사용하려면 정수로 된 숫자 값인 해시 코드가 필요하다.
      자바에는 정수 int , Integer 뿐만 아니라 char , String , Double , Boolean 등 수 많은 타입이 있다.
      뿐만 아니라 개발자가 직접 정의한 Member , User 와 같은 사용자 정의 타입도 있다.
      이 모든 타입을 해시 자료 구조에 저장하려면 모든 객체가 숫자 해시 코드를 제공할 수 있어야 한다.

    - 자바 Object 클래스의 hashCode()
        : public int hashCode();
            > 자바는 모든 객체가 자신만의 해시 코드를 표현할 수 있는 기능을 제공한다. 바로 Object 에 있는 hashCode() 메서드이다.
            > 이 메서드를 그대로 사용하기 보다는 보통 재정의(오버라이딩)해서 사용한다.
              이 메서드의 기본 구현은 객체의 참조값을 기반으로 해시 코드를 생성한다.
              쉽게 이야기해서 객체의 인스턴스가 다르면 해시 코드도 다르다.
*/

/*
    - Object의 해시 코드 비교
        : Object 가 기본으로 제공하는 hashCode() 는 객체의 참조값을 해시 코드로 사용한다.
          따라서 각각의 인스턴스마다 서로 다른 값을 반환한다.
          그 결과 obj1 , obj2 는 서로 다른 해시 코드를 반환한다.

    - 자바의 기본 클래스의 해시 코드
        : Integer , String 같은 자바의 기본 클래스들은 대부분 내부 값을 기반으로 해시 코드를 구할 수 있도록 hashCode() 메서드를 재정의해 두었다.
          따라서 데이터의 값이 같으면 같은 해시 코드를 반환한다.
          해시 코드의 경우 정수를 반환하기 때문에 마이너스 값이 나올 수 있다.

    - 동일성과, 동등성
        : 동일성은 자바 머신 기준이고 메모리의 참조가 기준으로 물리적이다.
          동등성은 보통 사람이 생각하는 논리적인 것에 기준을 맞춘다. 따라서 논리적이다.
        : 동일성(Identity)
            == 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
        : 동등성(Equality)
            equals() 메서드를 사용하여 두 객체가 논리적으로 동등한지 확인

    - 직접 구현하는 해시 코드
        : Member 의 경우 회원의 id 가 같으면 논리적으로 같은 회원으로 표현할 수 있다.
          따라서 회원 id 를 기반으로 동등성을 비교하도록 equals 를 재정의해야 한다.
          여기에 hashCode() 도 같은 원리가 적용된다. 회원의 id 가 같으면 논리적으로 같은 회원으로 표현할 수 있다.
          따라서 회원 id 를 기반으로 해시 코드를 생성해야 한다.

    - Member의 hashCode() 구현
        : Member 는 hashCode() 를 재정의했다.
          hashCode() 를 재정의할 때 Objects.hash() 에 해시 코드로 사용할 값을 지정해주면 쉽게 해시 코드를 생성할 수 있다.
          hashCode() 를 재정의하지 않으면 Object 가 기본으로 제공하는 hashCode() 를 사용하게 된다.
          이것은 객체의 참조값을 기반으로 해시 코드를 제공한다. 따라서 회원의 id 가 같아도 인스턴스가 다르면 다른 해시 코드를 반환하게 된다.
          hashCode() 를 id 를 기반으로 재정의한 덕분에 인스턴스가 달라도 id 값이 같으면 같은 해시 코드를 반환한다.
          따라서 인스턴스가 다른 member1, member2 둘다 같은 해시 코드를 반환하는 것을 확인할 수 있다.

    - 정리
        : 자바가 기본으로 제공하는 클래스 대부분은 hashCode() 를 재정의해두었다.
          객체를 직접 만들어야 하는 경우에 hashCode() 를 재정의하면 된다.
          hashCode() 만 재정의하면 필요한 모든 종류의 객체를 해시 자료 구조에 보관할 수 있다.
          정리하면 해시 자료 구조에 데이터를 저장하는 경우 hashCode() 를 구현해야 한다.
*/




















