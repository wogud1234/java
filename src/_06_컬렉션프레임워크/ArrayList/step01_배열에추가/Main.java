package _06_컬렉션프레임워크.ArrayList.step01_배열에추가;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[3];

        System.out.println(Arrays.toString(arr));
        arr = addToEnd(arr, 1);
        System.out.println(Arrays.toString(arr));
        arr = addToEnd(arr, 2);
        System.out.println(Arrays.toString(arr));
        arr = addToEnd(arr, 3);
        System.out.println(Arrays.toString(arr));
        arr = addToEnd(arr, 4);
        System.out.println(Arrays.toString(arr));

        arr = addToFront(arr, 9);
        System.out.println(Arrays.toString(arr));
        arr = addToFront(arr, 8);
        System.out.println(Arrays.toString(arr));
        arr = addToFront(arr, 7);
        System.out.println(Arrays.toString(arr));

        arr = addToMid(arr, 5, 99);
        System.out.println(Arrays.toString(arr));
        arr = addToMid(arr, 1, 99);
        System.out.println(Arrays.toString(arr));
        arr = addToMid(arr, 3, 99);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] addToEnd(int[] arr, int data) {
        int idx = 0;
        if((idx=isCheckFull(arr)) >= arr.length)
            arr = arrSizeUp(arr);

        arr[idx] = data;

        return arr;
    }

    private static int isCheckFull(int[] arr) {

        int idx = 0;
        while(true) {
            if(idx >= arr.length)
                break;
            if(arr[idx] == 0)
                break;
            idx++;
        }
        return idx;
    }

    private static int[] arrSizeUp(int[] arr) {

        int[] newArr = new int[arr.length + 3];

        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    private static int[] addToFront(int[] arr, int data) {
        int idx = 0;
        if((idx=isCheckFull(arr)) >= arr.length)
            arr = arrSizeUp(arr);

        for(int i=0 ; i<idx ; i++)
            arr[idx-i] = arr[idx-i-1];

        arr[0] = data;

        return arr;
    }
    private static int[] addToMid(int[] arr, int loc, int data) {

        int idx = 0;
        if((idx=isCheckFull(arr)) >= arr.length)
            arr = arrSizeUp(arr);

        for(int i=0 ; i<idx-loc ; i++)
            arr[idx-i] = arr[idx-i-1];

        arr[loc] = data;

        return arr;
    }
}

/*
    - 배열처럼 처음부터 정적으로 길이가 정해져있는 것이 아니라, 동적으로 언제든지 길이를 늘리고 줄일 수 있는
      자료 구조가 있다면 편리할 것이다.
*/
