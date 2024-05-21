package _04_열거형.step03_타입안전열거형패턴2;

public class Main {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService ds = new DiscountService();

        int basic = ds.discount(ClassGrade.BASIC, price);
        int gold = ds.discount(ClassGrade.GOLD, price);
        int diamond = ds.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
        System.out.println();
    }
}
