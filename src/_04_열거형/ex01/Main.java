package _04_열거형.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("등급 입력[GUEST, LOGIN, ADMIN]: ");
        String grade = scan.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        System.out.println("=====메뉴 목록=====");
        if(authGrade.getLevel() > 0)
            System.out.println("- 메인 화면");
        if(authGrade.getLevel() > 1)
            System.out.println("- 이메일 관리 화면");
        if(authGrade.getLevel() > 2)
            System.out.println("- 관리자 확인");
    }
}
