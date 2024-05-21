package _00_공통.ch02_연산자;

public class ex01_castring {
    public static void main(String[] args) {

        byte rst1 = 10 + 20;			// 리터럴 간의 연산은 컴파일 단계에서 계산	-> 실행 시 연산이 없으므로 성능이 좋다.

        byte x = 10;
        byte y = 20;

        byte rst2 = (byte)(x + y);		// 변수 간의 연산은 실행 단계에서 계산	-> int보다 작은 타입은 실행 시 연산 시 int형으로 자동 변환되어 계산을 수행한다.

        System.out.println(rst1);
        System.out.println(rst2);

        System.out.println("\n------------------\n");

        byte a = 10;
        byte b = 20;
//		byte c = a + b;		// error -> a, b는 모두 int형 보다 작기 때문에 연산자 '+'는 이 두 개의 피연산자들의 자료형을 int형으로 변환한 후 연산을 수행한다.
        byte c = (byte)(a + b);

        System.out.println(c);

        System.out.println("\n------------------\n");

        long d = 1_000_000 * 1_000_000;		// 연산결과가 int타입의 최대값을 넘으므로 오버플로우 발생 -> 이미 이상한 값이 되므로 이후 (자동)형변환 되어도 올바른 값이 나올 수 없다.
        long e = 1_000_000 * 1_000_000L;	// 한 쪽을 long형으로 바꿔주면 나머지 한 쪽도 long형(상대적으로 큰 자료형)으로 바뀌기 때문에 올바른 값이 얻어진다.

        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("\n------------------\n");

        int f = 1000000;

        int result1 = f * f / f;		// 첫 번째 f*f 에서 오버플로우 발생!!!
        int result2 = f / f * f;

        System.out.printf("%d * %d / %d = %d\n", f, f, f, result1);
        System.out.printf("%d / %d * %d = %d\n", f, f, f, result2);		// 같은 의미의 식이라도 연산의 순서에 따라서 다른 결과를 얻을 수 있다는 것에 주의해야한다.

    }
}
