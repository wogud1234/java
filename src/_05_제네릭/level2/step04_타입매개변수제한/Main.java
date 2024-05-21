package _05_제네릭.level2.step04_타입매개변수제한;

import _05_제네릭.level2.animal.Cat;
import _05_제네릭.level2.animal.Dog;

public class Main {
    public static void main(String[] args) {

        AnimalHospital<Dog> dogHospital = new AnimalHospital<>();
        AnimalHospital<Cat> catHospital = new AnimalHospital<>();

        // 동물 병원에 이상한거 들어오는 문제 해결..
        // AnimalHospital<Integer> integerHospital = new AnimalHospital<>();
        // AnimalHospital<Object> objectHospital = new AnimalHospital<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        // 문제1: 개 병원에 고양이 전달
        //dogHospital.set(cat);             // 매개변수 체크 실패 해결: 컴파일 오류가 발생하지 않음 -> 컴파일 오류 발생

        // 문제2: 개 타입 반환, 캐스팅 필요   해결 -> 캐스팅 필요x
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}

/*
    - 기존 문제 해결
        1) 타입 안전성X 문제
            : 개 병원에 고양이를 전달하는 문제가 발생한다.                                -> 해결
            : Animal 타입을 반환하기 때문에 다운 캐스팅을 해야 한다.                      -> 해결
            : 실수로 고양이를 입력했는데, 개를 반환하는 상황이라면 캐스팅 예외가 발생한다.   -> 해결

        2) 제네릭 도입 문제
            : 제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.                 -> 해결
              (Animal 을 상한으로 두어서 Animal과 Animal의 자식들만 들어올 수 있게 되었다.)
            : 어떤 타입이든 수용할 수 있는 Object 로 가정하고, Object 의 기능만 사용할 수 있다. -> 해결
              (Animal 을 상한으로 두어서 Animal 의 기능을 사용할 수 있다.)

    - 정리
        : 제네릭에 타입 매개변수 상한을 사용해서 타입 안전성을 지키면서 상위 타입의 원하는 기능까지 사용할 수 있었다.
          덕분에 코드 재사용과 타입 안전성이라는 두 마리 토끼를 동시에 잡을 수 있었다.
*/
















