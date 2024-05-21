package _01_OOP.ch01_메서드;

class MyMath {
    long a, b;

    // 인스턴스변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
    long add() { return a + b; }
    long substract() { return a - b; }
    long multiply() { return a * b; }
    long divide() { return a / b; }

    // 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b) { return a + b; }
    static long substract(long a, long b) { return a - b; }
    static long multiply(long a, long b) { return a * b; }
    static long divide(long a, long b) { return a / b; }
}

public class ex03_instance와static {

    public static void main(String[] args) {

        System.out.println(MyMath.add(1, 2));

        MyMath mm = new MyMath();
        mm.a = 1;
        mm.b = 2;
        System.out.println(mm.add());
    }
}
