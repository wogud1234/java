package _01_OOP.step08_인터페이스_역할과구현.ex02.OCP후;

// 결제 수단을 찾지 못했을 때 사용
public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
