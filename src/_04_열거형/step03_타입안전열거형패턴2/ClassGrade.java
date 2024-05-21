package _04_열거형.step03_타입안전열거형패턴2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    private final int discountPercent;

    public int getDiscountPercent() {
        return discountPercent;
    }
}
/*
    - 할인율은 각각의 회원 등급별로 판단된다.
      할인율은 결국 회원등급을 따라간다.
      따라서 회원 등급 클래스가 할인율을 가지고 관리하도록 변현하자.
*/