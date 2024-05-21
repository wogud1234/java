package _05_제네릭.level2.ex01;

import _05_제네릭.level2.ex01.bioUnits.BioUnit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t1) {
        T unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
    // T에 상한을 안 걸어주면 BioUnit의 메서드를 사용하지 못한다.


    public static void printV2(Shuttle<? extends BioUnit> t1) {
        BioUnit unit = t1.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
    // T에 상한을 안 걸어주면 BioUnit의 메서드를 사용하지 못한다.
}
