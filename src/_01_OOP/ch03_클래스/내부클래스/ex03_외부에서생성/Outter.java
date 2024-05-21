package _01_OOP.ch03_클래스.내부클래스.ex03_외부에서생성;

public class Outter {
    class InstanceInner {
        int iv = 100;
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }
    void method() {
        @SuppressWarnings("unused")
        class LocalInner {
            int iv = 400;
        }
    }
}
