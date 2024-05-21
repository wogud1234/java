package _01_OOP.step07_추상클래스_인터페이스.step04_인터페이스등장;

public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍...");
    }

    @Override
    public void move() {
        System.out.println("개 이동...");
    }
}
