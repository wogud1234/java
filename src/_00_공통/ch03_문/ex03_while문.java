package _00_공통.ch03_문;

public class ex03_while문 {
    public static void main(String[] args) {

        for(int i=1 ; i<=100 ; i++) {
            System.out.printf("i = %d ", i);

            int tmp = i;

            do {
                if(tmp%10%3==0 && tmp%10!=0)
                    System.out.print("짝");
            } while((tmp/=10) != 0);

            System.out.println();
        }
    }
}
