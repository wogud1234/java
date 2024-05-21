package _01_OOP.ch04_인터페이스.활용.관계만들기2;

public class LiftableImpl implements Liftable {
    @Override
    public void liftOff() { System.out.println("이륙"); }
    @Override
    public void move(int x, int y) { System.out.println("이동"); }
    @Override
    public void stop() { System.out.println("정지"); }
    @Override
    public void land() { System.out.println("착륙"); }
}
