package _01_OOP.ch03_클래스.다형성.매개변수;

public class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Monitor extends Product {
    Monitor() {
        super(100);
    }
    public String toString() { return "Monitor"; }
}
class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() { return "Computer"; }
}
class Keyboard extends Product {
    Keyboard() {
        super(20);
    }
    public String toString() { return "Keyboard"; }
}
