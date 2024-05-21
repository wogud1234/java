package _00_공통.ch02_연산자;

public class ex04_실수연산오차 {
    public static void main(String[] args) {


        ex01();
        //ex02();

        System.out.println();
        System.out.println(1 - 0.9);	// 0.09999999999999998
    }

    private static void ex01() {

        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number * pieceUnit;

        System.out.println("사과 1개에서 남은 양: " + result);		// 0.29999999999999993
    }

    private static void ex02() {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        int result = totalPieces - number;

        System.out.println("10조각에서 남은 조각: " + result);
        System.out.println("사과 1개에서 남은 양: " + result / 10.0);
    }


}
