package _01_OOP.ch03_클래스.다형성.추상클래스_공통추출;

public class Main {
    public static void main(String[] args) {

        Unit[] group = new Unit[4];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Dropship();
        group[3] = new Marine();

        for(int i=0 ; i<group.length ; i++)
            group[i].move(100, 200);		// 추상메서드가 구현된 인스턴스의 메서드가 호출된다.
    }
}
