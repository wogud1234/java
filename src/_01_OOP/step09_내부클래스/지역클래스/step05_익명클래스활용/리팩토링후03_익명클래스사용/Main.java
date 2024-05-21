package _01_OOP.step09_내부클래스.지역클래스.step05_익명클래스활용.리팩토링후03_익명클래스사용;

import java.util.Random;

public class Main {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        Process dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Process sum = new Process() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        System.out.println("[Hello 실행]\n");
        hello(dice);                // 참조값 대신, 인스턴스 바로 인수로 전달 가능.
        System.out.println();
        hello(sum);
    }
}
