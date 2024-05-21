package _01_OOP.ch03_클래스.다형성.매개변수;

public class Main {
    public static void main(String[] args) {

        Buyer buyer = new Buyer();

        buyer.buy(new Monitor());
        buyer.buy(new Computer());
        buyer.buy(new Keyboard());

        System.out.println("현재 잔액은 " + buyer.money + "만원입니다.");
        System.out.println("현재 포인트는 " + buyer.bonusPoint + "점입니다. ");
        System.out.println();
        buyer.summary();
    }
}
