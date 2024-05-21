package _00_공통.ch04_배열.인덱스활용;

import java.util.Arrays;

public class 버블정렬 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = (int)(Math.random()*100) + 1;
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i<arr.length-1 ; i++) {
            boolean changed = false;	// 자리 바꿈 발생했는지 체크
            for(int j=0 ; j<arr.length-1-i ; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    changed = true;
                }
            }
            System.out.println(Arrays.toString(arr));
            if(!changed)
                break;
        }

        System.out.println("정렬된 결과: " + Arrays.toString(arr));
    }
}
