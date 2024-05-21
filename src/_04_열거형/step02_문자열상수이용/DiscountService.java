package _04_열거형.step02_문자열상수이용;

public class DiscountService {

    public int discount(String grade, int price) {

        int discountPercent = 0;

        if(grade.equals(StringGrade.BASIC))
            discountPercent = 10;
        else if(grade.equals(StringGrade.GOLD))
            discountPercent = 20;
        else if(grade.equals(StringGrade.DIAMOND))
            discountPercent = 30;
        else
            System.out.println(grade + ": 할인X");

        return price * discountPercent / 100;
    }
}

