package _05_제네릭.level2.step05_제네릭메서드.활용;

import _05_제네릭.level2.animal.Animal;

public class AnimalMethod {

    // Animal로 상한을 제한함으로써, 매개변수 t로 Animal의 기능을 사용할 수 있다.
    // 제한 안 하면 Object의 기능만 사용할 수 있다.
    public static <T extends Animal> void checkup(T t) {
        System.out.println("동물 이름: " + t.getName());
        System.out.println("동물 크기: " + t.getSize());
        t.sound();
    }

    public static <T extends Animal> T getBigger(T t1, T t2) {
        return t1.getSize() > t2.getSize() ? t1 : t2;
    }
}
