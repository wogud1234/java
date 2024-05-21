package _04_열거형.step05_열거형리팩토링;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
            this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public int discount(int price) {
        return price * discountPercent / 100;
    }
}

// - Grade가 스스로 할인율를 계산하면서 DiscountService 클래스가 더는 필요하지 않게 되었다.