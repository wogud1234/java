package _01_OOP.step08_인터페이스_역할과구현.ex02.OCP후;

public class PayService {

    // !!!!!!!결제 수단 추가 시 변하지 않는 부분!!!!!!!
    public void processPay(String option, int amount) {

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if(result)
            System.out.println("결제가 성공했습니다.\n");
        else
            System.out.println("결제에 실패했습니다.\n");
    }
}
