package _01_OOP.ch03_클래스.다형성.형변환1;

public class Car {
    String color;
    int door;
    void drive() { System.out.println("drive, Brrr~"); }
    void stop() { System.out.println("stop!!!"); }
}

class FireEngine extends Car {
    void water() { System.out.println("water!!!"); }
}