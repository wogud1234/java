package _03_유틸.java_lang.System클래스;

/*
    - Java프로그램은 os상에서 바로 실행되는 것이 아니라 JVM위에서 실행되기 때문에 OS의 모든 기능을 자바 코드로 직접 접근하기는 어렵다.
      그러나 System클래스를 이용하면 운영체제의 일부 기능을 이용할 수 있다.

    - 필드
        out         - 콘솔에 문자 출력
        err         - 콘솔에 에러 내용 출력
        in          - 키보드 입력

    - 메소드
        exit(int status)
        currentTimeMillis()
        nanoTime()
        getProperty()               - OS와 사용자 정보 제공
        getenv()                    - OS의 환경 변수 정보 제공
*/
public class ex01 {

    public static void main(String[] args) {

        try {
            int value = Integer.parseInt("1oo");
        } catch(NumberFormatException e) {
            System.err.println("[에러 내용]");
            System.err.println(e.getMessage());
        }
        System.out.println();

        System.out.println(System.getProperties());     // 시스템 속성 읽기
        System.out.println("\n==========================================================================================================================================\n");
        System.out.println(System.getenv());            // 환경변수 읽기
    }
}
