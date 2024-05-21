package _01_OOP.ch01_메서드;

public class ex01_재귀호출 {
    public static void main(String[] args) {

        int result = factorial(4);
        System.out.println(result);
    }

    static int factorial(int n) {
        int result = 0;
        if(n == 1)
            result = 1;
        else
            result = n * factorial(n-1);

        return result;
    }
}
/*
    - 재귀호출은 비효율적이므로 재귀호출에 드는 비용보다 재귀호출의 간결함이 주는 이득이 충분히 큰 경우에만 사용해야 한다.
    - 스택오버플로우 문제 주의!!!
*/
