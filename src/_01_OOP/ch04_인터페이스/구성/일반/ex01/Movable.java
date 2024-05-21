package _01_OOP.ch04_인터페이스.구성.일반.ex01;

public interface Movable {
    void move(int x, int y);
}
interface Attackable {
    void attack(Unit u);
}

interface Fightable extends Movable, Attackable {

}