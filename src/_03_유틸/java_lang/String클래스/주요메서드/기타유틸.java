package _03_유틸.java_lang.String클래스.주요메서드;

import java.util.Arrays;

public class 기타유틸 {
    public static void main(String[] args) {

        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numString = String.valueOf(num);
        String boolString = String.valueOf(bool);
        String objString = String.valueOf(obj);

        String sumString2 = "" + num;

        char[] strCharArray = str.toCharArray();
        System.out.println("strCharArray = " + Arrays.toString(strCharArray));


    }
}
