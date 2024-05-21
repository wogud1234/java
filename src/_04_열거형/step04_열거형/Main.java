package _04_열거형.step04_열거형;

import _04_열거형.step03_타입안전열거형패턴.ClassGrade;

public class Main {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService ds = new DiscountService();

        int basic = ds.discount(Grade.BASIC, price);
        int gold = ds.discount(Grade.GOLD, price);
        int diamond = ds.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
/*
    - enum은 열거형 내부에서 상수로 지정하는 것외에 직접 생성이 불가능하다.
        : 생성자가 private임..


*/