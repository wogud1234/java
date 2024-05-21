package _01_OOP.step09_내부클래스.내부클래스활용.step02_내부클래스;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Model Y", 100);
        myCar.start();
    }
}

/*
    - 바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때,
      내부 클래스의 인스턴스는 자신을 생성한 바깥 클래스의 인스턴스를 자동으로 참조한다.
      여기서는 new Engine() 로 생성된 Engine 인스턴스는 자신을 생성한 바깥의 Car 인스턴스를 자동으로 참조한다.

    - 리팩토링 전에는 결과적으로 모델 이름과 충전 레벨을 외부에 노출했다.
      이것은 불필요한 Car 클래스의 정보들이 추가로 외부에 노출되는 것이기 때문에 캡슐화를 떨어뜨린다.
      리팩토링 후에는 getModel() , getChargeLevel() 과 같은 메서드를 모두 제거했다.
      결과적으로 꼭 필요한 메서드만 외부에 노출함으로써 Car 의 캡슐화를 더 높일 수 있었다
*/