package _03_유틸.java_lang.System클래스;

public class ex02_in {
    public static void main(String[] args) throws Exception {

        int speed = 0;
        int keyCode = 0;

        while(true) {
            if(keyCode != 13 && keyCode != 10) {    // [Enter]키를 읽지 않았을 경우
                if(keyCode == 49) {                 // 숫자 1 키를 읽었을 경우
                    speed++;
                } else if (keyCode == 50) {         // 숫자 2 키를 읽었을 경우
                    speed--;
                } else if (keyCode == 51) {         // 숫자 3 키를 읽었을 경우
                    break;
                }
                System.out.println("-----------------------");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("-----------------------");
                System.out.println("현재 속도 = " + speed);
                System.out.print("선택: ");
            }
            keyCode = System.in.read();
            // System클래스에서 제공하는 필드 in을 이용해서 read()를 호출하면 입력된 키의 코드값을 얻을 수 있다.
        }
        System.out.println("프로그램 종료~~~~");
    }
}
