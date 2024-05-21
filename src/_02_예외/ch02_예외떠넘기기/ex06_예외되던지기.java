package _02_예외.ch02_예외떠넘기기;

/*
 	- 예외 되던지기
 		: 한 메서드에서 발생할 수 있는 예외가 여럿인 경우, 일부는 try-catch문을 통해서 메서드 내에서 자체적으로 처리하고,
 		  그 나머지는 선언부에 지정하여 호출한 메서드에서 처리하도록 함으로써 양쪽에서 나눠서 처리되도록 할 수 있다.
 		: 심지어는 단 하나의 예외에 대해서도 예외가 발생한 메서드와 호출한 메서드, 양쪽에서 처리하도록 할 수 있다.
 		: 이것은 예외를 처리한 후에 인위적으로 다시 발생시키는 방법을 통해서 가능한데, 이것을 '예외 되던지기'라고 한다.

 		: 먼저 예외가 발생할 가능성이 있는 메서드에서 try-catch문을 사용해서 예외를 처리해주고 catch문에서 필요한 작얼을 행한 후에
 		  throw문을 사용해서 예외를 다시 발생시킨다.
 		  다시 발생한 예외는 이 메서드를 호출한 메서드에게 전달되고 호출한 메서드의 try-catch문에서 예외를 또다시 처리한다.
*/
public class ex06_예외되던지기 {
    public static void main(String[] args) {

        try {
            method1();
        } catch(Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    }

    public static void method1() throws Exception {
        try {
            throw new Exception();
        } catch(Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            throw e;
        }
    }
}
