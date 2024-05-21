package _01_OOP.ch03_클래스.내부클래스.ex04_참조변수;

public class Main {
    public static void main(String[] args) {

        Outter outer = new Outter();

        Outter.Inner inner = outer.new Inner();
        inner.method();
    }
}
