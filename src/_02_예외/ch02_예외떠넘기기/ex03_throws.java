package _02_예외.ch02_예외떠넘기기;

/*
 	- 자바에서는 메서드를 작성할 때 메서드 내에서 발생할 가능성이 있는 예외를 메서드의 선언부에 명시하여
 	  이 메서드를 사용하는 쪽에서는 이에 대한 처리를 하도록 강요한다.
*/

public class ex03_throws {
    public static void main(String[] args) throws Exception {

        // 호출스택에 있는 메서드들을 따라 전달되다가 제일 마지막에 있는 main메서드에서도 처리되지 않으면, main메서드마저 종료되어 프로그램이 전체가 종료된다.
        method1();
    }

    static void method1() throws Exception {
        method2();
    }
    static void method2() throws Exception {
        throw new Exception();
    }
}
