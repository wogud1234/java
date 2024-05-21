package _01_OOP.step07_추상클래스_인터페이스.step02_추상클래스등장;

public class Main {
    public static void main(String[] args) {

        // Animal animal = new Animal();    // 생성 불가....

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Animal[] animals = {dog, cat, cow};

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }
    /*
        1. 다형적 참조 덕분에 Animal변수는 자식인 Dog, Cat, Cow의 인스턴스를 참조할 수 있다.
        2. 메서드 오버라이딩 덕분에 animal.sound()를 호출해도 Dog.sound(), Cat.sound(), Cow.sound()와 같이
           각 인스턴스의 메서드를 호출할 수 있다.
    */

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료\n");
    }
    // 나중에 새로운 동물이 추가되어도 이 메서드는 변경하지 않아도 된다.
}
/*
    - 남은 문제
        1) Animal 클래스를 생성할 수 있는 문제
        2) Animal 클래스를 상속받은 곳에서 sound()를 오버라이딩 하지 않을 가능성..

        ==> 추상 클래스와 추상 메서드를 사용하면 이런 문제를 한번에 해결할 수 있다.
*/
