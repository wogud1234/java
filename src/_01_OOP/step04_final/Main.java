package _01_OOP.step04_final;

public class Main {
    public static void main(String[] args) {

        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);
        System.out.println();

        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);
        System.out.println();

        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
/*
    - 생성자를 사용해서 final 필드를 초기화 하는 경우, 각 인스턴스마다 final 필드에 다른 값을 할당할 수 있다.
      ex) 고객의 id를 변경하면 큰 문제가 발생한다면 final로 선언하고 생성자로 값을 할당한다.
          이렇게 하면 만약 어디선가 실수로 id 값을 변경하려 한다면 컴파일러가 문제를 찾아준다.

    - final 필드를 필드에서 초기화 하는 경우, 모든 인스턴스의 필드는 같은 값을 가진다.
      생성자 초기화오 ㅏ다르게 필드 초기화는 필드의 코드에 해당 값이 미리 정해져있기 때문이다.

    - 모든 인스턴스가 같은 값을 사용하기 때문에 결과적으로 메모리를 낭비하게 된다.
      또 메모리 낭비를 떠나서 같은 값이 계속 생성되는 것은 명확한 중복이다.
      이렇 때 사용하면 좋은 것이 바로 static 영역이다.

    - 상수
        : FieldInit.CONST_VALUE는 메서드 영역의 static 영역에 존재한다. 그리고 final 키워드를 사용해서 초기값이 변하지 않는다.
          static 영역은 단 하나만 존재하는 영역이다. CONST_VALUE 변수는 JVM 상에서 하나만 존재하므로 앞서 설명한 중복과 메모리 비효율 문제를 모두 해결할 수 있다.
          이런 이유로 필드에 'final + 필드 초기화'를 사용하는 경우 static을 붙여서 사용하는 것이 효과적이다.
        : 상수는 변하지 않고, 항상 일정한 값을 갖는 수를 말한다.
          자바에서는 보통 단 하나만 존재하는 변하지 않는 고정된 값을 사우라 한다.
          이런 이유로 상수는 static final 키워드를 사용한다.
        : 상수는 기능이 아니라 고정된 값자체를 사용하는 것이 목적이다.
        : 상수는 값을 변경할 수 없다. 따라서 필드에 직접 접근해도 데이터가 변하는 문제가 발생하지 않는다.
          그래서 public으로 선언해도 된다.
        : 보통 상수들은 애플리케이션 전반에서 사용되기 때문에 public을 자주 사용한다.
          물론 특정 위치에서만 사용된다면 다른 접근 제어자를 사용하면 된다
        : 상수는 중앙에서 값을 하나로 관리할 수 있다는 장점도 있다.
        : 상수는 런타임에 변경할 수 없다. 상수를 변경하려면 프로그램을 종료하고, 코드를 변경한 다음 프로그램을 다시 실행해야 한다.

        : 결론적으로, 자바에서는 static final을 사용해 정적이면서 고칠 수 없는 변수를 상수라고 한다.

    - final을 기본형 변수에 사용하면 값을 변경할 수 없다.
    - final을 참조형 변수에 사용하면 참조값을 변경할 수 없다.
*/