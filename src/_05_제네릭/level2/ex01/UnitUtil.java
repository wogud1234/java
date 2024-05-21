package _05_제네릭.level2.ex01;

import _05_제네릭.level2.ex01.bioUnits.BioUnit;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T t1, T t2) {

        return (t1.getHp() > t2.getHp()) ? t1 : t2;
    }
}
