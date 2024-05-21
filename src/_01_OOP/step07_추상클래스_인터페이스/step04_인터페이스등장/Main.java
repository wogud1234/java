package _01_OOP.step07_추상클래스_인터페이스.step04_인터페이스등장;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Animal[] animals = {dog, cat, cow};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
        System.out.println();
        for (Animal animal : animals) {
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료\n");
    }

    private static void moveAnimal(Animal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}

