package _01_OOP.ch03_클래스.내부클래스.ex04_참조변수;

public class Outter {
    int value = 10;

    static void staticMethod() { }

    class Inner {
        int value = 20;

        void method() {
            int value = 30;
            System.out.println("            value: " + value);
            System.out.println("       this.value: " + this.value);
            System.out.println("Outer3.this.value: " + Outter.this.value);

            staticMethod();
        }
    }
}
