package _00_공통.ch04_배열.인덱스활용;

import java.util.Arrays;

public class 숫자채우기 {
    public static void main(String[] args) {

        int[] code = { -4, -1, 3, 6, 11 };
        int[] arr = new int[10];

        for(int i=0, tmp=0 ; i<arr.length ; i++) {
            tmp = (int)(Math.random()*code.length);
            arr[i] = code[tmp];
        }

        System.out.println(Arrays.toString(arr));
    }
}
