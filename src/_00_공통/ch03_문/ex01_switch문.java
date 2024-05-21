package _00_공통.ch03_문;

public class ex01_switch문 {

    /*
        - switch문의 조건식 결과는 정수 or 문자열이어야 한다.
          case문의 값은 정수타입(byte, char, short, int, long)과 상수만 가능하며, 중복되지 않아야 한다. -> JDK1.7 부터는 문자열 리터럴도 가능
    */
    /*
 		- Java12 부터는 switch문에서 Expression을 사용할 수 있다.
	 	  break문을 없애는 대신에 화살표와 중괄호를 사용해 가독성이 좋아졌다.
	*/
    static void ex01() {

        char grade = 'B';

        switch(grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> System.out.println("일반 회원입니다.");

            default -> {
                System.out.println("손님입니다.");
            }
        }
    }
    /*
         - Switch Expression을 사용하면 스위치된 값을 변수에 바로 대입할 수도 있다. 단일 값일 경우에는 화살표 오른쪽에 값을 기술하면 되고,
           중괄호를 사용할 경우에는 yield(java13부터 사용 가능)키워드로 값을 지정하면 된다. 단, 이 경우에는 default가 반드시 존재해야 한다.
    */
    static void ex02() {
        String grade = "B";

        int score1 = 0;
        switch(grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1 = " + score1);

        int score2 = switch(grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };
        System.out.println("score2 = " + score2);
    }
    public static void main(String[] args) {

        ex01();
        ex02();
    }
}
