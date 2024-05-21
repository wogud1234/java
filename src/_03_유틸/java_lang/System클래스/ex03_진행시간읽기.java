package _03_유틸.java_lang.System클래스;

public class ex03_진행시간읽기 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        int sum = 0;
        for(int i=0 ; i<1000000 ; i++)
            sum += i;
        long end = System.currentTimeMillis();

        System.out.println("sum = " + sum);
        System.out.println("진행시간 = " + (end - start));  // 1590300
    }
}
