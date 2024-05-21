package _01_OOP.ch04_인터페이스.구성.일반.ex01;

public class Fighter extends Unit implements Fightable {

    @Override
    public void move(int x, int y) {
        // ...
    }
    @Override
    public void attack(Unit u) {
        // ...
    }
}
