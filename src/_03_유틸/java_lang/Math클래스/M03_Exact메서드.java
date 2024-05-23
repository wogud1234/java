package _03_유틸.java_lang.Math클래스;

/*
	- 메서드 이름에 'Exact'가 포함된 메서드들이 JDK1.8부터 새로 추가되었다.
	  이들은 정수형간의 연산에서 발생할 수 있는 오버플로우를 감지하기 위한 것이다.

	  		int addExact(int x, int y)
	  		int subtractExact(int x, int y)
	  		int multiplyExact(int x, int y)

	  		int imcrementExact(int a)
	  		int decrementExact(int a)
	  		int negateExact(int a)

	  		int toIntExact(long value)

	- 연산자는 단지 결과를 반환할 뿐, 오버플로우의 발생여부에 대해 알려주지 않는다. 그러나 위의 메서드들은 오버플로우가 발생하면,
	  ArithmeticException 예외를 발생시킨다.
*/

public class M03_Exact메서드 {
    public static void main(String[] args) {
        // negateExact(int a)는 매개변수의 부호를 반대로 바꿔준다.
        // 부호를 반대로 바꾸는 식은 '~a + 1' 이다. '~a' 의 결과가 int의 최대값이면, 여기에 1을 더하니까 오버플로우가 발생할 수 있는 것이다.

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("max = " + max);

        System.out.println("min = " + min);
        System.out.println("(-min) = " + (-min));

        try {
            System.out.println("Math.negateExact(10) = " + Math.negateExact(10));
            System.out.println("Math.negateExact(-10) = " + Math.negateExact(-10));
            System.out.println("Math.negateExact(min) = " + Math.negateExact(min));
        } catch(ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
            System.out.println("Math.negateExact(-2147483648) = " + Math.negateExact((long)min));
        }
    }
}
