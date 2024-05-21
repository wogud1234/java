package _00_공통.ch04_배열.인덱스활용;

import java.util.Arrays;

public class 섞기 {
    public static void main(String[] args) {

        int[] numArr = new int[10];

        for(int i=0 ; i<numArr.length ; i++) {
            numArr[i] = i;
        }
        System.out.println(Arrays.toString(numArr));

        int tmp = 0;
        for(int i=0, idx=0 ; i<numArr.length ; i++) {
            idx = (int)(Math.random() * numArr.length);
            tmp = numArr[i];
            numArr[i] = numArr[idx];
            numArr[idx] = tmp;
        }

        System.out.println(Arrays.toString(numArr));
    }
}
