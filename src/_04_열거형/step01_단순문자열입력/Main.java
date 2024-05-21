package _04_열거형.step01_단순문자열입력;

public class Main {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService ds = new DiscountService();

        int basic = ds.discount("BASIC", price);
        int gold = ds.discount("GOLD", price);
        int diamond = ds.discount("DIAMOND", price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);

        System.out.println();

        // 존재하지 않는 등급
        int vip = ds.discount("VIP", price);

        // 오타
        int diamondd = ds.discount("DIAMONDD", price);

        // 소문자 입력
        int gold2 = ds.discount("gold", price);
    }
}
/*
    - 단순히 문자열을 입력하는 방식의 문제점
        1) 타입 안전성 부족
            : 문자열은 오타가 발생하기 쉽고, 유효하지 않는 값이 입력될 수 있다.

        2) 데이터 일관성
            : "GOLD", "gold", "Gold"등 다양한 형식으로 문자열을 입력할 수 있어 일관성이 떨어진다.

    - 잘못된 문자열의 입력값은 컴파일 시에는 감지되지 않고, 런타임에서만 문제가 발견되기 때문에 디버깅이 어려워진다.

    - BASIC, GOLD, DIAMOND라는 정확한 문자만 discount()에 전달되어야 한다.
      하지만 String은 어떤 문자열이든 받을 수 있기 때문에 자바 문법 관점에서는 아무런 문제가 없다.
      결국 String 타입을 사용해서는 문제를 해결할 수 없다.
*/