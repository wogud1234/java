package _01_OOP.step09_내부클래스.지역클래스.step04_익명클래스;

import _01_OOP.step09_내부클래스.지역클래스.step02_인터페이스구현.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;

        Printer printer = new Printer() {

            int value = 0;

            @Override
            public void print() {
                System.out.println("value=" + value);
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + paramVar);
                System.out.println("outInstanceVar=" + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class=" + printer.getClass());
    }

    public static void main(String[] args) {

        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}

/*
    - 익명 클래스는 이름이 없는 지역 클래스이다.
      특정 부모 클래스(인터페이스)를 상속 받고 바로 생성하는 경우 사용한다.
      지역 클래스가 일회성으로 사용되는 경우나 간단한 구현을 제공할 때 사용한다.
*/
