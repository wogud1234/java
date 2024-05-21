package _04_열거형.step03_타입안전열거형패턴;

public class DiscountService {

    public int discount(ClassGrade grade, int price) {

        int discountPercent = 0;

        if(grade == ClassGrade.BASIC)
            discountPercent = 10;
        else if(grade == ClassGrade.GOLD)
            discountPercent = 20;
        else if(grade == ClassGrade.DIAMOND)
            discountPercent = 30;
        else
            System.out.println(grade + ": 할인X");

        return price * discountPercent / 100;
    }
}

/*
    - 매개변수로 넘어오는 인수가 ClassGrade가 가진 상수 중 하나를 사용한다.
      따라서 열거한 상수의 참조값으로 비교(==)하면 된다.
        : 참조값 비교(==) 사용!!!!!!
*/
