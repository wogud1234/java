package _00_공통.ch03_문;

public class ex02_for문 {
    public static void main(String[] args) {

        System.out.println("  i%7     i/7\n---------------");
        for(int i=0 ; i<20 ; i++) {
            System.out.printf("    %d     %d\n", i%7, i/7);
        }
		/*
		 	- 나머지 연산자(%)를 사용하면 특정 범위의 값들이 순환하면서 반복되는 값을 얻을 수 있고,
		 	  나누기 연산자(/)를 사용하면 같은 값이 연속적으로 반복되게 할 수 있다.
		*/

        System.out.println("-----------------------");

        for(int i=1 ; i<=3 ; i++)
            for(int j=1 ; j<=3 ; j++)
                for(int k=1 ; k<=3 ; k++)
                    System.out.println("" + i + j + k);

        System.out.println("-----------------------");

        for(int i=1 ; i<=5 ; i++) {
            for(int j=1 ; j<=5 ; j++)
                System.out.print("[" + i + "," + j + "]");
            System.out.println();
        }

        System.out.println("-----------------------");

        boolean flag = false;
        for(int i=1 ; i<=5 ; i++) {
            for(int j=1 ; j<=5 ; j++) {
                if(i==j)
                    System.out.print("[" + i + "," + j + "]");
                else
                    System.out.print("     ");
            }

            System.out.println();
        }

        System.out.println("-----------------------");

        int[] arr = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for(int i=0 ; i<arr.length ; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        for(int num : arr)		// JDK1.5 부터 향상된 for문이 추가되었다.
            System.out.print(num + " ");
        System.out.println();
    }
}
