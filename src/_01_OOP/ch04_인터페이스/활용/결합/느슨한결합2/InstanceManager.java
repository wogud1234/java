package _01_OOP.ch04_인터페이스.활용.결합.느슨한결합2;

public class InstanceManager {
    public static I getInstance() {
        return new B();						// 다른 인스턴스로 바꾸려면 여기만 변경하면 됨.
    }
}
class A {
    void methodA() {
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());	// i로 Object의 메서드 호출 가능
    }
}

class B implements I {
    public void methodB() {
        System.out.println("methodB in B class");
    }
    public String toString() { return "class B"; }
}

/*
 	- 느슨한 결합1 에서는 매개변수를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 동적으로 제공받아야 했다.
 	  또 다른 방법으로는 제3의 클래스를 통해서 제공받는 방법이 있다.

 	- 인스턴스를 직접 생성하지 않고 getInstance()를 통해 제공 받는다.
 	  이렇게 하면 나중에 다른 클래스의 인스턴스로 변경되어도 A클래스의 변경없이 getInstance()만 변경하면 된다는 장점이 있다.
*/