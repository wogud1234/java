package _01_OOP.step01_절차지향vs객체지향_캡슐화.step05_캡슐화와접근제어자;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if(isAmountValid(amount))
            balance += amount;
        else
            System.out.println("유효하지 않은 금액입니다.");
    }

    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance-amount>=0)
            balance -= amount;
        else
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
    }

    public int getBalance() {
        return balance;
    }

    private static boolean isAmountValid(int amount) {
        return amount > 0;
    }
    /*
        - 이 메서드를 public으로 열어두면, 사용자는 입금과 출금 전에 본인이 먼저 이 메서드를 사용해서 검증을 해야하는 것으로 오해할 수 있다.
    */
}
/*
    - 캡슐화
        : 캡슐화는 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것을 말한다.
        : 캡슐화를 통해서 데이터의 직접적인 변경을 방지하거나 제한할 수 있다.
        : 캡슐화는 속성과 기능을 하나로 묶고, 외부에 꼭 필요한 기능만 노출하고 나머지는 모두 내부로 숨기는 것이다.
        : 캡슐화를 안전하게 완성할 수 있게 해주는 장치가 바로 접근 제어자이다.

        1) 데이터 숨기기
            : 객체 내부의 데이터를 외부에서 함부로 접근하게 두면, 클래스 안에서 데이터를 다루는 모든 로직을 무시하고 데이터를 변경할 수 있다.
              결국 모든 안전망을 빠져나가게 되어 캡슐화가 깨진다.
              ex) 자동차를 운전할 때 자동차 부품을 다 열어서 그 안에 있는 속도계를 직접 조잘하지 않는다.
                  단지 자동차가 제공하는 엑셀 기능을 사용해서 엑셀을 밟으면 자동차가 나머지는 다 알아서 하는 것이다.
            : 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서 접근해야 한다.

        2) 기능 숨기기
            : 객체의 기능 중에서 외부에서 사용하지 않고 내부에서만 사용하는 기능들이 있다.
              이런 기능도 모두 감추는 것이 좋다.
              만약 사용자에게 이런 기능까지 모두 알려준다면, 사용자가 사용하려는 클래스에 대해 너무 많은 것을 알아야 한다.
              사용자 입장에서 꼭 필요한 기능만 외부에 노출하자. 나머지 기능은 모두 내부로 숨기자

        정리) 데이터는 모두 숨기고, 기능은 꼭 필요한 기능만 노출하는 것이 좋은 캡슐화이다.
*/