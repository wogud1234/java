package _03_유틸.java_lang.Math클래스;

import static java.lang.Math.*;

public class M01_삼각_로그함수 {

    public static void main(String[] args) {
        
        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 2;
        
        double c = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));     // (x1, y1), (x2, y2) 사이의 거리

        double a = c * sin(PI/4);               // c를 빗변으로 하는 직각 삼각형에서 45도의 각도를 기준으로 하는 변의 길이
        double b = c * cos(PI/4);
        double d = c * cos(toRadians(45));      // 각도를 라디안으로 변환

        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("d = " + d);

        System.out.println("atan2(a, b) = " + atan2(a, b));
        System.out.println("(atan2(a, b) * 180 / PI) = " + (atan2(a, b) * 180 / PI));
        System.out.println("toDegrees(atan2(a, b)) = " + toDegrees(atan2(a, b)));

        System.out.println("(24 * log10(2)) = " + (24 * log10(2)));
        System.out.println("(53 * log10(2)) = " + (53 * log10(2)));
    }
}
