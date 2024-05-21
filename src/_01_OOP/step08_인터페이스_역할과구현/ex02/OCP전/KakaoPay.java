package _01_OOP.step08_인터페이스_역할과구현.ex02.OCP전;

public class KakaoPay {

    public boolean pay(int amount) {
        System.out.println();
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
