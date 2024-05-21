package _02_예외.step02_checked예외처리;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NetworkService service = new NetworkService();


        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("전송할 문자: ");
            String input = scan.nextLine();
            if(input.equals("exit"))
                break;
            service.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
