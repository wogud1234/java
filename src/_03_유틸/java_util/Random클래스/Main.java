package _03_유틸.java_util.Random클래스;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
//        Random random = new Random(1);
        /*
            - seed가 같으면 Random의 결과가 같다.
              생성자를 비워두면 내부에서 System.nanoTime()에 여러가지 복잡한 알고리즘을 섞어서 씨드값을 생성한다.
              따라서 반복 실행해도 결과가 항상 달라진다.
        */

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();              // 0.0d <= x < 1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        int randomRange1 = random.nextInt(10);          // 0 <= x < 10
        System.out.println("0 ~  9: " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;      // 1 <= x < 11
        System.out.println("1 ~ 10: " + randomRange2);
    }
}

/*
    - Math.random()을 사용해도 되지만 Random클래스를 사용하면 더 다양한 랜덤값을 구할 수 있다.
      Math.random()도 내부에서는 Random클래스를 사용한다.
*/
