package _00_공통.ch04_배열;

public class ex01_초기화 {
    public static void main(String[] args) {

        // 다차원 배열 선언하기
        int[][] arr1 = new int[][] { {1, 2, 3}, {4, 5, 6} };

        int[][] arr2 = {
                {1, 2, 3}, {4, 5, 6}
        };

        int[][] arr0=  new int[5][3];

        // 가변 배열 선언하기
        int[][] arr3 = new int[5][];
        arr3[0] = new int[4];
        arr3[1] = new int[3];
        arr3[2] = new int[2];
        arr3[3] = new int[2];
        arr3[4] = new int[3];

        int[][] arr5 = {
                {100, 100, 100, 100},
                {20, 20, 20},
                {30, 30},
                {40, 40},
                {50, 50, 50}
        };

        int idx1 = 3;
        int idx2 = 3;
        int cnt = 0;
        int[][] arr6 = new int[idx1][idx2];

        for(int i=0 ; i<idx1 ; i++)
            for(int j=0 ; j<idx2 ; j++)
                arr6[i][j] = cnt++;

        for(int i=0 ; i<idx1 ; i++) {
            for(int j=0 ; j<idx2 ; j++)
                System.out.print(arr6[i][j]);
            System.out.println();
        }
    }
}
