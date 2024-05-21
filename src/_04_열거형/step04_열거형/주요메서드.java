package _04_열거형.step04_열거형;

import java.util.Arrays;

// 모든 열거형은 java.lang.Enum 클래스를 상속 받으므로 해당 클래스가 제공하는 기능들을 사용할 수 있다.
public class 주요메서드 {
    public static void main(String[] args) {

        Grade[] values = Grade.values();        // 모든 ENUM 반환
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }
        System.out.println();

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);      // input과 일치하는 ENUM 상수를 반환한다. 잘못된 문자면 IllegalArgumentException 발생...
        System.out.println("gold = " + gold);
    }
}

/*
    - values()
        : 모든 ENUM 상수를 포함하는 배열을 반환

    - valueOf(String name)
        : 주어진 이름과 일치하는 ENUM 상수를 반환

    - name()
        : ENUM 상수의 이름을 문자열로 반환

    - ordinal()
        : ENUM 상수의 선언 순서(0부터 시작)를 반환

    - toString()
        : name()가 비슷하지만, 얘는 직접 오버라이딩 가능.

    - 열거형은 인터페이스를 구현할 수 있다.
    - 열거형에 추상 메서드를 선언하고, 구현할 수 있다.
*/