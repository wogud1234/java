package _01_OOP.ch03_클래스.다형성.오버라이딩메서드호출;

public class Main {
    public static void main(String[] args) {

        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}
