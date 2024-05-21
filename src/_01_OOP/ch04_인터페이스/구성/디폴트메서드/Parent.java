package _01_OOP.ch04_인터페이스.구성.디폴트메서드;

public class Parent {
    public void method2() {
        System.out.println("method() in Parent");
    }
}

class Child extends Parent implements MyInterface1, MyInterface2 {

    @Override
    public void method1() {
        System.out.println("method() in Child");
        // 디폴트 메서드 충돌나서 이거는 오버라이딩 해줘야함..
    }
}