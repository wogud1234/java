package _01_OOP.step08_인터페이스_역할과구현.step02_역할구현분리;

public class Driver {

    private ICar car;

    public void setCar(ICar car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다~~~~");
        car.startEngine();
        car.pressAcceleraotr();
        car.offEngine();
    }
}
/*
    - Driver는 ICar의 역할에만 의존한다. 구현인 K3Car, Sonata에 의존하지 않는다.

    - OCP(Open-Closed Principle) 원칙
        1) Open for extension
            : 새로운 기능의 추가나 변경 사항이 생겼을 때, 기존 코드는 확장할 수 있어야 한다.
        2) Closed for modification
            : 기존의 코드는 수정되지 않아야 한다.

    - 변하지 않는 부분
        : 새로운 자동차를 추가할 때 가장 영향을 받는 중요한 클라이언트는 바로 Car의 기능을 사용하는 Driver이다.
          핵심은 Car 인터페이스를 사용하는 클라이언트인 Driver의 코드를 수정하지 않아도 된다는 것이다.

    - 변하는 부분
        : main()과 같이 새로운 차를 생성하고 Driver에게 필요한 차를 전달해주는 역할은 당연히 코드 수정이 발생한다.
          main()은 전체 프로그램을 설정하고 조율하는 역할을 한다. 이런 부분은 OCP를 지켜도 변경이 필요하다.

    - 정리
        1) Car를 사용하는 클라이언트 코드인 Driver 코드의 변경없이 새로운 자동차를 확장할 수 있다.
        2) 다향성을 활용하고 역할과 구현을 잘 분리한 덕분에 새로운 자동차를 추가해도 대부분의 핵심 코드들을 그대로 유지할 수 있게 되었다.
*/