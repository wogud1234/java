package _01_OOP.ch04_인터페이스.구성.일반.ex02;

public class Main {
    public static void main(String[] args) {

        RemoteControl rc;

        rc = new Tv();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}
