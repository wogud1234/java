package _01_OOP.step06_다형성.step01_다형적참조_캐스팅;

public class Main {
    public static void main(String[] args) {

        Parent poly = new Child();
        /*
            - 자식 인스턴스를 생성하면 그 인스턴스 안에는 부모타입, 자식타입의 인스턴스가 생성된다.
              참조변수의 타입으로 자식 인스턴스 안에있는 타입을 찾는다. 여기서는 부모 타입을 찾는다.

              poly.childMethod();   -> 컴파일 오류
                : Parent는 최상위 부모이다. 상속 관계는 부모로만 찾아서 올라갈 수 있다. childMethod()는 자식 타입에 있으므로 호출할 수 없다.

              Child child = poly;
                : 호출하는 타입(참조변수의 타입)을 Child타입으로 변경하면 Child 인스턴스 안에있는 Child타입에 접근하여 childMethod()를 호출할 수 있다.
                  그러나 부모는 자식을 담을 수 있지만 자식은 부모를 담을 수 없기 때문에 컴파일 에러가 난다.
                  이때 다운캐스팅이라는 기능을 사용해서 부모 타입을 잠깐 자식 타입으로 변경하면 된다.
        */
        Child child = (Child)poly;
        child.childMethod();

        ((Child)poly).childMethod();        // 일시적 다운 캐스팅

        poly = child;                       // 업캐스팅
        /*
            - 캐스팅을 한다고 해서 Parent poly의 타입이 변하는 것은 아니다. 해당 참조값을 꺼내고 꺼낸 참조값이 Child타입이 되는 것이다.
              따라서 poly의 타입은 Parent로 기존과 같이 유지된다.
        */
        System.out.println();


        try {
            Parent p = new Parent();
            Child c = (Child)p;
            System.out.println("캐스팅 성공!!!");
        } catch(ClassCastException e) {
            System.out.println(e.getMessage());
        }
        /*
            - new Parent()로 인스턴스를 생성하면 그 인스턴스 안에는 부모타입의 인스턴스만 생성된다.
              (메모리 상에 Child타입은 없는 상태.. -> Child 타입 자체를 사용할 수 없는 상태..)
              Child c = (Child)p; 로 다운 캐스팅하면 Child타입 참조변수로 좀 전에 생성된 인스턴스를 참조하게 되는데,
              그 인스턴스에는 Child 타입이 없어서 런타임 에러가 발생하게 된다.

            - 업캐스팅의 경우에는 이런 문제가 절대로 발생하지 않는다. 왜냐하면 객체를 생성하면 해당 타입의 상위 부모 타입은 모두 함께 생성된다.
              따라서 위로만 타입을 변경하는 업캐스팅은 메모리 상에 인스턴스가 모두 존재하기 때문에 항상 안전하다. 따라서 캐스팅을 생략할 수 있다.
              반면에 다운캐스팅의 경우 인스턴스에 존재하지 않는 하위 타입으로 캐스팅하는 문제가 발생할 수 있다.
              왜냐햐면 객체를 생성하면 부모 타입은 모두 함께 생성되지만 자식 타입은 생성되지 않기 때문이다.
              따라서 개발자가 이런 문제를 인지하고 사용해야 한다는 의미로 명시적으로 캐스팅을 해주어야 한다.
        */
        System.out.println();

        try {
            Parent p = new Child();
            Child c = (Child)p;
            System.out.println("캐스팅 성공!!!");
        } catch(ClassCastException e) {
            System.out.println(e.getMessage());
        }

    }
}
/*
    - 업캐스팅
        : 자식 타입을 부모 타입에 담는거
          (부모 타입의 참조 변수에 자식 타입의 참조변수의 값을 대입하는거)

    - 다운캐스팅
        : 부모 타입을 자식 타입에 담는거
          (자식 타입의 참조 변수에 부모 타입의 참조변수의 값을 대입하는거)
*/
