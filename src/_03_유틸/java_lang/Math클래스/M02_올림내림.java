package _03_유틸.java_lang.Math클래스;

import static java.lang.Math.*;

/*
    -  Math클래스의 메서드는 모두 static이며, 2개의 상수만 정의해 놓았다.
            public static final double E = 2.7182818284590452354;
 	  		public static final double PI = 3.14159265358979323846;
*/
public class M02_올림내림 {
    public static void main(String[] args) {

        double val = 90.7552;

        System.out.println("round(val) = " + round(val));                       // 91

        val *= 100;
        System.out.println("round(val) = " + round(val));                       // 9076
        System.out.println("(round(val)/100) = " + (round(val) / 100));         // 90
        System.out.println("(round(val) / 100.0) = " + (round(val) / 100.0));   // 90.76
        System.out.println();

        System.out.println("ceil(1.1) = " + ceil(1.1));         // 2.0
        System.out.println("floor(1.5) = " + floor(1.5));       // 1.0
        System.out.println("round(1.1) = " + round(1.1));       // 1
        System.out.println("round(1.5) = " + round(1.5));       // 2        // round()는 반환값이 int
        System.out.println("round(-1.5) = " + round(-1.5));     // -1
        System.out.println("rint(1.5) = " + rint(1.5));         // 2.0
        System.out.println("rint(2.5) = " + rint(2.5));         // 2.0      // rint()는 가운데 있는 값은 가장 가까운 짝수 정수를 반환한다. -> 3.0이 아니라 2.0 이다.
        System.out.println("rint(2.6) = " + rint(2.6));
        System.out.println("rint(-1.5) = " + rint(-1.5));       // -2.000000
        System.out.println("ceil(-1.5) = " + ceil(-1.5));       // -1.000000
        System.out.println("floor(-1.5) = " + floor(-1.5));     // -2.000000
    }
}
