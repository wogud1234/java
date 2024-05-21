package _01_OOP.ch03_클래스.상속.참조변수super;

public class Main {
    public static void main(String[] args) {

        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        c1.method();
        System.out.println();
        c2.method();
    }
}
