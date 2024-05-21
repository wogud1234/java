package _01_OOP.ch03_클래스.다형성.추상클래스_공통추출;

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);	// 앞으로 이 클래스를 상속받아서 작성되는 클래스들은 이 메서드를 자신의 클래스에 알맞게 반드시 구현해야 한다는 의미가 담겨있다.
    void stop() { System.out.println("Stop!!!"); }
}
class Marine extends Unit {
    void move(int x, int y) { System.out.println("지정된 위치로 달림.."); }
    void stimPack() { System.out.println("스팀팩 사용!!"); }
}
class Tank extends Unit {
    void move(int x, int y) { System.out.println("지정된 위치로 주행.."); }
    void changeMode() { System.out.println("시즈모드~~"); }
}
class Dropship extends Unit {
    void move(int x, int y) { System.out.println("지정된 위치로 비행.."); }
    void load() { System.out.println("유닛을 태움"); }
    void unLoad() { System.out.println("유닛을 내림"); }
}