package _01_OOP.ch04_인터페이스.활용.관계만들기2;

public class Building { }
class Bunker extends Building {	}
class Academy extends Building { }

class Barrack extends Building implements Liftable {
    LiftableImpl l = new LiftableImpl();
    @Override
    public void liftOff() {
        l.liftOff();
    }
    @Override
    public void move(int x, int y) {
        l.move(x, y);
    }
    @Override
    public void stop() {
        l.stop();
    }
    @Override
    public void land() {
        l.land();
    }
}
class Factory extends Building implements Liftable {
    LiftableImpl l = new LiftableImpl();
    @Override
    public void liftOff() {
        l.liftOff();
    }
    @Override
    public void move(int x, int y) {
        l.move(x, y);
    }
    @Override
    public void stop() {
        l.stop();
    }
    @Override
    public void land() {
        l.land();
    }
}
/*
 	- Barrack클래스가 Liftable인터페이스를 구현하도록 하고, 인터페이스를 구현한 LiftableImpl클래스를 Barrack클래스에 포함시켜서
 	  내부적으로 호출해서 사용하도록 했다.
 	  이렇게 함으로써 같은 내용의 코드를 Barrack클래스와 Factory클래스에서 각각 작성하지 않고 LiftableImpl클래스 한 곳에서 관리할 수 있다.
 	  그리고 작성된 Liftable인터페이스와 이를 구현한 LiftableImpl클래스는 후에 다시 재사용될 수 있을 것이다.
*/