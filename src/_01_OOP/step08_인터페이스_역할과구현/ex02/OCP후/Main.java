package _01_OOP.step08_인터페이스_역할과구현.ex02.OCP후;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PayService payService = new PayService();

        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);

        System.out.println("\n----------------------------------\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("결제 수단을 입력하세요: ");
        String option = scan.nextLine();

        System.out.print("결제 금액을 입력하세요: ");
        int amount = scan.nextInt();

        payService.processPay(option, amount);
    }
}
