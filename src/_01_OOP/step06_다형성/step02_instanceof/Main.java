package _01_OOP.step06_다형성.step02_instanceof;

import _01_OOP.step06_다형성.step01_다형적참조_캐스팅.Child;
import _01_OOP.step06_다형성.step01_다형적참조_캐스팅.Parent;

public class Main {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        /*
            - Parent타입의 참조변수는 자신과 같은 Parent의 인스턴스도 참조할 수 있고, 자식 타입인 Child의 인스턴스도 참조할 수 있다.
              이때 parent1, parent2 변수가 참조하는 인스턴스의 타입을 확인하고 싶다면 instanceof 키워드를 사용하면 된다.
        */

        System.out.println("parent1 호출");
        call(parent1);
        System.out.println();

        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod();
        if(parent instanceof Child) {
            Child child = (Child)parent;
            child.childMethod();
        }
        /*
            - 오른쪽에 있는 타입에 왼쪽에 있는 참조변수가 참조하고 있는 인스턴스의 타입이 들어갈 수 있으면 true....
              (== 왼쪽의 참조변수가 참조하고 있는 인스턴스의 타입이 오른쪽의 타입보다 자손이면 true...)
        */
    }
}
