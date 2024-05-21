package _00_공통.ch01_변수;

public class ex01_printf {
    public static void main(String[] args) {

        byte  b = 1;
        short s = 2;
        char  c = 'A';

        int  finger = 10;
        long big    = 1000_000_000_000L;
        long hex    = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b = %d\n", b);
        System.out.printf("s = %d\n", s);
        System.out.printf("c = %c, %d\n", c, (int)c);

        System.out.printf("[%5d]\n", finger);
        System.out.printf("[%-5d]\n", finger);
        System.out.printf("[%05d]\n", finger);

        System.out.printf("big = %d\n", big);
        System.out.printf("hex = %#X\n", hex);

        System.out.printf("octNum = %o, %d\n", octNum, octNum);
        System.out.printf("hexNum = %x, %d\n", hexNum, hexNum);
        System.out.printf("binNum = %s, %d\n", Integer.toBinaryString(234), binNum);

        System.out.println("\n------------------------\n");

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789;

        System.out.printf("f1 = %f, %e, %g\n", f1, f1, f1);
        System.out.printf("f2 = %f, %e, %g\n", f2, f2, f2);
        System.out.printf("f3 = %f, %e, %g\n", f3, f3, f3);

        System.out.printf("d = %f\n", d);
        System.out.printf("d = %14.10f\n", d);

        String url = "www.codechobo.com";

        System.out.printf("[12345678901234567890]\n");
        System.out.printf("[%s]\n", url);
        System.out.printf("[%20s]\n", url);
        System.out.printf("[%-20s]\n", url);
        System.out.printf("[%-20.8s]\n", url);

		/*
		 	- %f 는 기본적으로 소수점 아래 6자리까지만 출력하기 때문에 소수점 아래 7자리에서 반올림한다.
		*/
    }
}
