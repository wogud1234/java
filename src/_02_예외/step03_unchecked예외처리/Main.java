package _02_예외.step03_unchecked예외처리;

import _02_예외.step03_unchecked예외처리.exceptions.SendException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NetworkService networkService = new NetworkService();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            // 해결 못했던 예외들 공통 처리
            try {
                networkService.sendMessage(input);
            } catch (Exception e) { // 모든 예외를 잡아서 처리
                getExceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void getExceptionHandler(Exception e) {

        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("====개발자용 디버깅 메시지====");
        e.printStackTrace(System.out);
//        e.printStackTrace();              // <-- e.printStackTrace(System.err);    - 이거로 하면 출력스트림이 달라서 콘솔창이 뒤죽박죽 된다.

        // 필요하면 예외 별로 별도의 추가 처리 가능.
        if(e instanceof SendException sendEx)
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
    }


}
