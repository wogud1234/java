package _05_제네릭.level2.step04_타입매개변수제한;

import _05_제네릭.level2.animal.Animal;

public class AnimalHospital<T extends Animal> {     // Animal과 Animal의 자식들만 들어올 수 있다.
                                                    //      -> 이 클래스 안에서는 최소한 Animal에 정의된 기능은 사용할 수 있게 된다.
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
