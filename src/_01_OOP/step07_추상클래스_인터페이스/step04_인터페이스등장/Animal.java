package _01_OOP.step07_추상클래스_인터페이스.step04_인터페이스등장;

public interface Animal {

    public abstract void sound();   // public abstract 생략 가능...
    public abstract void move();

    public static final double MY_PI = 3.14;   // public static final 생략 가능...
}
/*
    - 자바는 순수 추상 클래스를 더 편리하게 사용할 수 있는 인터페이스라는 기능을 제공한다.

    - 인터페이스는 순수 추상클래스와 같고, 약간의 편이 기능만 추가된 것이다.
        1) 인터페이스의 메서드는 모두 public abstract 이라서 이를 생략할 수 있다.
        2) 인터페이스는 다중 구현(다중 상속)을 지원한다.
        3) 인터페이스에서 멤버 변수는 public static final이 모두 포함되었다고 간주된다.
           (static final은 정적이면서 고칠 수 없는 변수. 즉, 상수이다.)
*/

/*
    - 클래스, 추상 클래스, 인터페이스는 프로그램 코드, 메모리 구조상 모두 똑같다.
      모두 자바에서는 .class로 다루어진다.

    - 순수 추상클래스 대신 인터페이스를 사용하는 이유
        1) 인터페이스를 사용하는 이유는 인터페이스를 구현하는 곳에서 인터페이스의 모든 메서드를 반드시 구현하라는 규약을 주는 것이다.
           (인터페이스의 규약은 반드시 구현해라는 것이다..)
           그런데 순수 추상 클래스의 경우 미래에 누군가 그곳에 실행 가능한 메서드를 끼워 넣을 수 있다.
           이렇게 되면 추가된 기능을 자식 클래스에서 구현하지 않을 수도 있고, 더 이상 순수 추상 클래스가 아니게 된다.
           인터페이스는 모든 메서드가 추상 메서드이기 때문에 이런 문제를 원천 차단할 수 있다.

           java8에 등장한 default 메서드, java9에 등장한 private 메서드는 예외적인거...

        2) 다중 상속 가능
*/