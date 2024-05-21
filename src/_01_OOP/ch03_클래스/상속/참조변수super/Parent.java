package _01_OOP.ch03_클래스.상속.참조변수super;

/*
 	- 조상의 멤버와 자신의 멤버를 구별하는데 사용된다는 점을 제외하고는 super와 this는 근본적으로 같다.
 	  모든 인스턴스메서드에는 자신이 속한 인스턴스의 주소가 지역변수로 저장되는데, 이것이 참조변수인 this와 super의 값이 된다.
    - static메서드는 this, super 둘 다 사용할 수 없다.
*/

public class Parent {
    int x = 10;

    public void pMethod() {
        System.out.println("조상 메서드~~~~");
    }
}

class Child1 extends Parent {

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);	// 조상 클래스로부터 상속받은 멤버도 자손 클래스 자신의 멤버이므로 super대신 this를 사용할 수 있다.
        System.out.println("super.x = " + super.x);	// (x) 조상 클래스의 멤버와 자손클래스의 멤버가 중복 정의되어 서로 구별해야하는 경우에만 super를 사용한다.
    }
}
class Child2 extends Parent {
    int x = 20;
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);	// 조상 클래스의 멤버와 자손클래스의 멤버가 중복 정의되어 서로 구별해야하는 경우에만 super를 사용한다.
    }

    public void pMethod() {
        super.pMethod();	// 오버라이딩할 때 조상클래스의 메서드의 내용에 추가적으로 작업을 덧붙이는 경우라면 이처럼 super를 사용해서
        // 조상클래스의 메서드를 포함시키는 것이 좋다.
    }
}


