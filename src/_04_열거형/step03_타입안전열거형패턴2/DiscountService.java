package _04_열거형.step03_타입안전열거형패턴2;

public class DiscountService {

    public int discount(ClassGrade grade, int price) {

        return price * grade.getDiscountPercent() / 100;
    }
}

/*
    - if문이 제거되고 단순한 할인율로 계산 로직만 남는다.
*/
