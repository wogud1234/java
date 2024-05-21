package _04_열거형.step04_열거형;

import _04_열거형.step03_타입안전열거형패턴.ClassGrade;

public class DiscountService {

    public int discount(Grade grade, int price) {

        int discountPercent = 0;

        if(grade == Grade.BASIC)
            discountPercent = 10;
        else if(grade == Grade.GOLD)
            discountPercent = 20;
        else if(grade == Grade.DIAMOND)
            discountPercent = 30;
        else
            System.out.println(grade + ": 할인X");

        return price * discountPercent / 100;
    }
}

