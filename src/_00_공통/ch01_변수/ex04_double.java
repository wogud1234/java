package _00_공통.ch01_변수;

public class ex04_double {
    public static void main(String[] args) {

        /*
	 		- 정밀도
	 			float  -> 7자리
	 			double -> 15자리
		*/

        float  f = 9.12345678901234567890f;
        float f2 = 1.2345678901234567890f;
        double d = 9.12345678901234567890d;

        System.out.printf("     123456789012345678901234\n");
        System.out.printf("f  :   %f\n", f);			// %f는 기본적으로 소수점 이하 6자리까지만 출력하므로, 7번째 자리에서 반올림되어 9.124357이 된다.
        System.out.printf("f  : %24.20f\n", f);			// float 변수의 저장공간의 한계로 오차가 발생하여 실제로 저장된 값은 9.123456XXXXXXXX이다.
        System.out.printf("f2 : %24.20f\n", f2);		// 간혹 8자리이상 이치하는 경우도 있긴 하다.
        System.out.printf("d  : %24.20f\n", d);

        System.out.println("\n----------------------\n");

        float ff = 9.1234567f;
        int i = Float.floatToIntBits(ff);	// float타입의 값을 int타입의 값으로 해석해서 반환한다.

        System.out.printf("%f\n", f);
        System.out.printf("%X\n", i);
    }
}
