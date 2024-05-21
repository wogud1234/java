package _02_예외.ch02_예외떠넘기기;

/*
	- 예외 발생시키기
		: 연잔자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
		  키워드 throw를 이용해서 예외를 발생시킨다.
*/

public class ex02_throw_발생시키기 {
    public static void main(String[] args) {

        try {
            throw new Exception("고의로 발생시켰음.");
        } catch(Exception e) {
            System.out.println("에러 메시지: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료 되었음.");

//         throw new Exception();
//              - Exception클래스들의 예외가 발생할 가능성이 있는 문장들에 대해서는 예외처리를 해주지 않으면 컴파일조차 되지 않는다.

        throw new ArithmeticException("또 고의로 발생시켰음...");
//              - RuntimeException클래스들의 예외는 컴파일은 됨....

		/*
		 	- RuntimeException클래스와 그 자손에 해당하는 예외는 프로그래머에 의해 실수로 발생하는 것들이기 때문에 예외처리를 강제하지 않는 것이다.
		 	  만일 RuntimeException클래스들에 속하는 예외가 발생할 가능성이 있는 코드에도 예외처리를 필수로 해야 한다면,
		 	  참조 변수와 배열이 사용되는 모든 곳에 예외처리를 해주어야 할 것이다...

		 	- 컴파일러가 예외처리를 확인하지 않는 RuntimeException클래스들은 'unchecked예외'라고 부르고,
		 	  예외처리를 확인하는 Exception클래스들은 'checked예외'라고 부른다.
		*/
    }
}
