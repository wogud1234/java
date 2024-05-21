package _05_제네릭.level2.step03_제네릭도입실패;

import _05_제네릭.level2.animal.Cat;
import _05_제네릭.level2.animal.Dog;

public class Main {
    public static void main(String[] args) {

        AnimalHospital<Dog> dogHospital = new AnimalHospital<>();
        AnimalHospital<Cat> catHospital = new AnimalHospital<>();
        AnimalHospital<Integer> integerHospital = new AnimalHospital<>();
        AnimalHospital<Object> objectHospital = new AnimalHospital<>();
    }
}

/*
    - 문제
        1) 자바 컴파일러는 어떤 타입이 들어올 지 알 수 없기 때문에 T 를 어떤 타입이든 받을 수 있는 모든 객체의 최종 부모인
           Object 타입으로 가정한다. 따라서 Object 가 제공하는 메서드만 호출할 수 있다.
           원하는 기능을 사용하려면 Animal 타입이 제공하는 기능들이 필요한데, 이 기능을 모두 사용할 수 없다.

        2) 동물 병원에 Integer , Object 같은 동물과 전혀 관계 없는 타입을 타입인자로 전달 할 수 있다는 점이다.
           우리는 최소한 Animal 이나 그 자식을 타입 인자로 제한하고 싶다.

    - 발생한 문제들을 생각해보면 타입 매개변수를 Animal 로 제한하지 않았기 때문이다.
      만약 타입 인자가 모두 Animal과 그 자식만 들어올 수 있게 제한한다면 어떨까?
*/