package _00_공통.ch03_문;

import java.util.Scanner;

public class ex04_while문_outer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int menu = 0, num = 0;

        outer:
        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)을 선택하세요. (종료: 0)> ");
            menu = scan.nextInt();

            if(menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if(!(1<=menu && menu<=3)) {
                System.out.println("메뉴를 잘못 선택했습니다. (종료는 0)");
                continue;
            }
            System.out.println("선택한 메뉴는 " + menu + "번 입니다.");

            while(true) {
                System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료: 99)> ");
                num = scan.nextInt();

                if(num == 0)
                    break;
                if(num == 99)
                    break outer;
                switch(menu) {
                    case 1:
                        System.out.println("result = " + num * num);
                        break;
                    case 2:
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                }
            }
        }
        System.out.println("프로그램 종료~~~~");
    }
}
