package _01_OOP.ch04_인터페이스.구성.일반.ex01;

public class Main {
    public static void main(String[] args) {

        Fighter f = new Fighter();

        if(f instanceof Unit)
            System.out.println("f는 Unit클래스의 자손입니다.");
        if(f instanceof Fightable)
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");
        if(f instanceof Movable)
            System.out.println("f는 Movable인터페이스를 구현했습니다.");
        if(f instanceof Attackable)
            System.out.println("f는 Attackable인터페이스를 구현했습니다.");
        if(f instanceof Object)
            System.out.println("f는 Object클래스의 자손입니다.");
    }
}
