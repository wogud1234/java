package _01_OOP.ch03_클래스.다형성.오버라이딩메서드호출;

/*
 	- 메서드의 경우 조상 클래스의 메서드를 자손의 클래스에서 오버라이딩한 경우 참조변수의 타입에 관계없이
 	  항상 실제 인스턴스의 메서드(오버라이딩 된)가 호출되지만, 멤버변수의 경우 참조변수의 타입에 따라 달라진다.
 	- 그러나 자손 클래스에서 조상클래스의 멤버를 중복으로 정의하지 않았을 때는 참조변수의 타입에 따른 변화는 없다.
*/

public class Parent {
    int x = 100;
    void method() { System.out.println("Parent Method"); }
}

class Child extends Parent {
    int x = 200;
    void method() { System.out.println("Child Method"); }
}