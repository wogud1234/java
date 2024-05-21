package _00_공통.ch01_변수;

public class ex05_casting {
    public static void main(String[] args) {

        System.out.println("<1. 정수형 간의 변환>");
        double d = 85.4;
        int score = (int)d;

        System.out.println("score = " + score);
        System.out.println("d = " + d);

        int i = 10;
        byte b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);

        i = 300;
        b = (byte)i;
        System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);

        b = 10;
        i = b;
        System.out.printf("[byte -> int] i=%d -> b=%d\n", i, b);

        b = -2;
        i = b;
        System.out.printf("[byte -> int] i=%d -> b=%d\n", i, b);

        System.out.println("i = " + Integer.toBinaryString(i));

        System.out.println("\n-------------------------\n");
        System.out.println("<2. 실수형 간의 변환>");

        float f    = 9.1234567f;
        double dl  = 9.1234567;
        double dl2 = (double)f;

        System.out.printf("f   = %20.18f\n", f);
        System.out.printf("dl  = %20.18f\n", dl);
        System.out.printf("dl2 = %20.18f\n", dl2);

        System.out.println("\n-------------------------\n");
        System.out.println("<3. 정수형과 실수형 간의 변환>");

        int n    = 912345657;
        float ff = n;
        int n2   = (int)ff;

        double dd = n;
        int n3 = (int)dd;

        float ff2 = 1.666f;
        int n4 = (int)ff2;

        System.out.printf("n  = %d\n", n);
        System.out.printf("ff = %f, n2 = %d\n", ff, n2);
        System.out.printf("dd = %f, n3 = %d\n", dd, n3);
        System.out.printf("(int)%f = %d\n", ff2, n4);
		/*
			- 큰 값의 int를 float로 변환할 때 정밀도 차이에 의한 오차가 발생할 수 있다.
			  그래서 10진수로 8자리 이상의 값은 실수형으로 변환할 때는 float가 아닌 double로 형변환해야 오차가 발생하지 않는다.
		*/

        System.out.println("\n-------------------------\n");
        System.out.println("<4. 기타...>");

        // 문자와 숫자 간의 변환

        int tmp = 0;

        tmp = 3 + '0';
        System.out.printf("tmp = %d\n", tmp);
        System.out.printf("tmp = %c\n", (char)tmp);

        tmp = '3' - '0';
        System.out.printf("tmp = %d\n", tmp);

        System.out.println();

        byte bNum;
        int iNum;

        bNum = 100;		// OK
        iNum = 100;

//		bNum = iNum;	// ERROR -> 컴파일러가 타입만 알고 값은 몰라서...
        bNum = (byte)iNum;
    }
}
