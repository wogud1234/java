package _01_OOP.step08_인터페이스_역할과구현.ex02.OCP후;

public abstract class PayStore {

    // !!!!!!!결제 수단 추가 시 변하는 부분!!!!!!!
    public static Pay findPay(String option) {
        if(option.equals("kakao"))
            return new KakaoPay();
        else if(option.equals("naver"))
            return new NaverPay();
        else
            return new DefaultPay();
    }
}
/*
    - static으로 기능을 제공하고, 추상 클래스로 선언해서 객체 생성을 막는다.
    - 결제 수단을 찾지 못했을 때 null 대신에 항상 실패하는 결제 수단을 사용한다.
*/