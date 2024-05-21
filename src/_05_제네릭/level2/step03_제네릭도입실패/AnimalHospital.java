package _05_제네릭.level2.step03_제네릭도입실패;

import _05_제네릭.level2.animal.Animal;

public class AnimalHospital<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // 컴파일 오류 -> 컴파일러가 T의 타입을 메서드를 정의하는 시점에는 알 수 없다. T로는 Object의 기능만 사용 가능
        // System.out.println("동물 이름: " + animal.getName());
        // System.out.println("동물 크기: " + animal.getSize());
        // animal.sound();
    }

    public T getBigger(T target) {
        // 컴파일 오류 -> 컴파일러가 T의 타입을 메서드를 정의하는 시점에는 알 수 없다. T로는 Object의 기능만 사용 가능
        // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
