package _01_OOP.ch04_인터페이스.활용.관계만들기1;

public class Unit {
    int hitPoint;
    final int MAX_HP;
    Unit(int hp) {
        MAX_HP = hp;
    }
}
class GroundUnit extends Unit {
    GroundUnit(int hp) { super(hp); }
}
class AirUnit extends Unit {
    AirUnit(int hp) { super(hp); }
}