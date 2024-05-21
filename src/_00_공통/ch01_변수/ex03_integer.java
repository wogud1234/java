package _00_공통.ch01_변수;

public class ex03_integer {
    public static void main(String[] args) {

        /*
		 	- JVM의 피연산자 스택이 피연산자를 4byte단위로 저장하기 때문에 크기가 4byte보다 작은 자료형의 값을 계산할 때는
		 	  4byte로 변환하여 연산이 수행된다. 그래서 오히려 int를 사용하는 것이 더 효율적이다.
		*/

        short sMin = -32768;
        short sMax = 32767;
        char cMin = 0;
        char cMax = 65535;

        System.out.println("sMin = " + sMin);
        System.out.println("sMin-1 = " + (short)(sMin-1));
        System.out.println("sMax = " + sMax);
        System.out.println("sMax+1 = " + (short)(sMax+1));

        System.out.println("cMin = " + (int)cMin);
        System.out.println("cMin-1 = " + (int)--cMin);
        System.out.println("cMax = " + (int)cMax);
        System.out.println("cMax+1 = " + (int)++cMax);
    }
}
