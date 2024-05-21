package _05_제네릭.level2.step07_와일드카드;

import _05_제네릭.level2.animal.Animal;
import _05_제네릭.level2.animal.Cat;
import _05_제네릭.level2.animal.Dog;

public class Main {
    public static void main(String[] args) {

        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<Dog>();
        Box<Cat> catBox = new Box<Cat>();

        dogBox.set(new Dog("멍멍이", 100));
        catBox.set(new Cat("냐옹이", 50));

        WhildCard.<Dog>printGeneric1(dogBox);
        WhildCard.printGeneric1(catBox);          // 타입 추론 가능

        WhildCard.printGeneric2(dogBox);
        WhildCard.printGeneric2(catBox);

        Dog dog = WhildCard.printAndReturnGeneric(dogBox);
        Cat cat = WhildCard.printAndReturnGeneric(catBox);

        System.out.println("\n-----------------------\n");

        WhildCard.printWhildCard1(dogBox);
        WhildCard.printWhildCard2(dogBox);
        Animal animal = WhildCard.printAndReturnWhildCard(dogBox);

        System.out.println("\n-----------------------\n");

        writeBox(objBox);
        writeBox(animalBox);
        // writeBox(dogBox);        // 하한이 Animal: Animal의 조상만 들어갈 수 있음
        // writeBox(catBox);        // 하한이 Animal: Animal의 조상만 들어갈 수 있음
    }

    // 와일드카드 하한
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
