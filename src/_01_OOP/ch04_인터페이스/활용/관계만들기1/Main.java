package _01_OOP.ch04_인터페이스.활용.관계만들기1;

public class Main {
    public static void main(String[] args) {

        Tank tank = new Tank();
        Dropship dropship = new Dropship();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
//		scv.repair((Repairable) marine);		// error)
    }
}
