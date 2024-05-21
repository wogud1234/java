package _05_제네릭.level2.step01;

import _05_제네릭.level2.animal.Cat;
import _05_제네릭.level2.animal.Dog;

public class Main {
    public static void main(String[] args) {

        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkUp();

        System.out.println();

        catHospital.set(cat);
        catHospital.checkUp();

        System.out.println();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.set(cat);        // 다른 타입 입력: 컴파일 오류

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}

/*
    - 요구사항
        : 개 병원은 개만 받을 수 있고, 고양이 병원은 고양이만 받을 수 있어야 한다.

    - 요점
        : 코드 재사용X
            -> 개 병원과 고양이 병원은 중복이 많이 보인다.

        : 타입 안전성O
            -> 타입 안전성이 명확하게 지켜진다.
*/