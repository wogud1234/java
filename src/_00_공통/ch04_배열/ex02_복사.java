package _00_공통.ch04_배열;

public class ex02_복사 {
    public static void main(String[] args) {

        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        System.out.println(abc);
        System.out.println(num);
        System.out.println();

        char[] result = new char[abc.length + num.length];

        System.arraycopy(abc,  0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);
        System.out.println();

        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);
        System.out.println();

        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
