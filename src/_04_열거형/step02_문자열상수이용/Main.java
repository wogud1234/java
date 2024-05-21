package _04_열거형.step02_문자열상수이용;

public class Main {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService ds = new DiscountService();

        int basic = ds.discount(StringGrade.BASIC, price);
        int gold = ds.discount(StringGrade.GOLD, price);
        int diamond = ds.discount(StringGrade.DIAMOND, price);

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
    - 상수는 미리 정의한 변수명을 사용할 수 있기 때문에 단순 문자열을 직접 사용하는 것 보다는 더 안전하다.
    - 더 좋은 점은 만약 실수로 상수의 이름을 잘못 입력하면 컴파일 시점에 오류가 발생한다는 점이다.
      따라서 오류를 쉽고 빠르게 찾을 수 있다.

    - 하지만 문자열 상수를 사용해도, 지금까지 발생한 문제들을 근본적으로 해결할 수는 없다.
      왜냐하면 String 타입은 어떤 문자열이든 입력할 수 있기 때문이다.
      어떤 개발자가 실수로 StringGrade에 있는 문자열 상수를 사용하지 않고, 직접 문자열을 사용해도 막을 수 있는 방법이 없다.
      그리고 사용해야 하는 문자열 상수가 어디에 있는지 discount()를 호출하는 개발자는 알 수가 없다. (주석...)
*/