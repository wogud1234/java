package _01_OOP.step09_내부클래스.지역클래스.step05_익명클래스활용.리팩토링전;

import java.util.Random;

public class Main {

    public static void helloDice() {

        System.out.println("프로그램 시작");
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + randomValue);
        System.out.println("프로그램 종료");
    }

    public static void helloSum() {

        System.out.println("프로그램 시작");
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        helloDice();
        System.out.println();
        helloSum();
    }
}
