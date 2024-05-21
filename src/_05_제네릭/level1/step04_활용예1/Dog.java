package _05_제네릭.level1.step04_활용예1;

public class Dog extends Animal {

    public Dog(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("멍멍...");
    }
}
