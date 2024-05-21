package _05_제네릭.level2.ex01;

import _05_제네릭.level2.ex01.bioUnits.BioUnit;

public class Shuttle <T extends BioUnit> {

    private T unit;

    public void in(T unit) {
        this.unit = unit;
    }

    public T out() {
        return unit;
    }

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
    // T에 상한을 안 걸어주면 BioUnit의 메서드를 사용하지 못한다.
}
