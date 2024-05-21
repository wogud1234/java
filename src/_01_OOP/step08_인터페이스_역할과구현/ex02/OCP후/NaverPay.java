package _01_OOP.step08_인터페이스_역할과구현.ex02.OCP후;

public class NaverPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("네이버페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }

    @Override
    public String toString() {
        return "네이버페이";
    }
}
