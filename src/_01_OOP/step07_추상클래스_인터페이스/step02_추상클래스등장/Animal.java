package _01_OOP.step07_추상클래스_인터페이스.step02_추상클래스등장;

abstract class Animal {
    public abstract void sound();

    // 일반 메서드는 자식 클래스에서 오버라이딩 안 해도 된다.
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

/*
    - 추상 클래스
        : Animal과 같이 부모 클래스는 제공하지만, 실제 생성되면 안되는 클래스를 추상클래스라 한다.
          추상 클래스는 이름 그대로 추상적인 개념을 제공하는 클래스이다. 따라서 실체인 인스턴스가 존재하지 않는다.
          대신에 상속을 목적으로 사용되고, 부모 클래스 역할을 담당한다.
          추상 클래스는 기존 클래스와 완전히 같다. 다만 new AbstractAnimal()과 같이 직접 인스턴스를 생성하지 못하는 제약이 추가된 것이다.

    - 추상 메서드
        : 부모 클래스를 상속 받는 자식 클래스가 반드시 오버라이딩 해야 하는 메서드를 부모 클래스에 정의할 수 있다.
          이것을 추상메서드라고 한다.
          추상 메서드는 이름 그대로 추상적인 개념을 제공하는 메서드이다. 따라서 실체가 존재하지 않고, 메서드 바디가 없다.

        : 추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다. 그렇지 않으면 컴파일 오류가 발생한다.
          추상 메서드는 자식 클래스가 반드시 오버라이딩 해야 하기 때문에 메서드 바디 부분이 없다.
          바디 부분을 만들면 컴파일 오류가 발생한다.

    - 추상 메소드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다. 그렇지 않으면 컴파일 오류가 발생한다.
      추상 메서드는 메서드 바디가 없다. 따라서 작동하지 않는 메서드를 가진 불완전한 클래스로 볼 수 있다.
      따라서 직접 생성하지 못하도록 추상 클래스로 선언해야 한다.
*/
