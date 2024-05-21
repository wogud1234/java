package _01_OOP.ch03_클래스.내부클래스.ex01_종류;

public class Main {

    // 1. 인스턴스 클래스
    class InstanceInner {
        int iv = 100;
        static int cv = 100;            // 정적 필드 (jdk17~~~)
        final static int CONST = 100;

        void method() { }
        static void staticMethod() { }  // 정적 메서드 (jdk17~~~)
    }

    // 2. static 클래스
    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    // 3. 지역 클래스
    void method() {
        class LocalInner {
            int iv = 300;
            static int cv = 300;			// error????) static 변수를 선언할 수 없다.
            final static int CONST = 300;	// 상수는 가능...
        }
    }

    // 4. 익명 클래스
    // ...

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(InstanceInner.cv);
        System.out.println(StaticInner.cv);
    }
}
