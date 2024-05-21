package _01_OOP.step07_추상클래스_인터페이스.step04_인터페이스등장;

public class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("음메...");
    }

    @Override
    public void move() {
        System.out.println("소 이동...");
    }
}
