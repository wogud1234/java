package _01_OOP.step09_내부클래스.내부클래스활용.step01_일반클래스;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Model Y", 100);
        myCar.start();
    }
}

/*
    - Car 클래스는 엔진에 필요한 메서드들을 제공해야 한다. 다음 메서드는 엔진에서만 사용하고,
      다른 곳에서는 사용하지 않는다.
          getModel()
          getChargeLevel()
      결과적으로 Car 클래스는 엔진에서만 사용하는 기능을 위해 메서드를 추가해서,
      모델 이름과 충전 레벨을 외부에 노출해야 한다.
*/