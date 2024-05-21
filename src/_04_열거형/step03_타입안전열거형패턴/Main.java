package _04_열거형.step03_타입안전열거형패턴;

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

        // ClassGrade에 정의되지 않은 값은 사용하면 컴파일 오류가 잡아줌!!!
        // int vip = ds.discount("VIP", price);
        // int diamondd = ds.discount("DIAMONDD", price);
        // int gold2 = ds.discount("gold", price);
    }
}
/*
    - 지금까지의 문제를 해결하기 위해 나온 결과가 바로 타입 안전 열거형 패턴이다.
    - enum은 enumeration의 줄임말인데, 어떤 항목을 나열하는 것을 뜻한다.
      여기서 중요한 것은 타입 안전 열거형 패턴을 사용하면 나열한 항목만 사용할 수 있다는 것이 핵심이다.

    - 타입 안전 열거형 패턴의 장점
        1) 타입 안정성 향상
            : 정해진 객체만 사용할 수 있기 때문에, 잘못된 값을 입력하는 문제를 근본적으로 방지할 수 있다.
              잘못된 값이 할당되거나 사용되는 것을 컴파일 시점에 방지할 수 있다.

        2) 데이터 일관성
            : 정해진 객체만 사용하므로 데이터의 일관성이 보장된다.
*/