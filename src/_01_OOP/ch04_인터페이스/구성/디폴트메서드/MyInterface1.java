package _01_OOP.ch04_인터페이스.구성.디폴트메서드;

public interface MyInterface1 {
    default void method1() {
        System.out.println("defaultMethod1() in MyInterface1");
    }
    default void method2() {
        System.out.println("defaultMethod2() in MyInterface1");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface1");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("defaultMethod1() in MyInterface2");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}
