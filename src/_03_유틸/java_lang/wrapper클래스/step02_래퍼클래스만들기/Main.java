package _03_유틸.java_lang.wrapper클래스.step02_래퍼클래스만들기;

public class Main {
    public static void main(String[] args) {

        MyInteger myInteger = new MyInteger(10);

        int i1 = myInteger.compareTo(5);
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
