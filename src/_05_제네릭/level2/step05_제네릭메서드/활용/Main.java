package _05_제네릭.level2.step05_제네릭메서드.활용;

import _05_제네릭.level2.animal.Cat;
import _05_제네릭.level2.animal.Dog;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 300);

        AnimalMethod.<Dog>checkup(dog);     // 명시적
        AnimalMethod.checkup(cat);          // 타입 추론

        Dog targetDog = new Dog("큰 멍멍이", 400);
        Dog bigger = AnimalMethod.getBigger(dog, targetDog);
        System.out.println("bigger = " + bigger);

     // Dog bigger2 = AnimalMethod.getBigger(dog, cat);          // 타입 추론 모호 -> 컴파일 에러
    }
}
