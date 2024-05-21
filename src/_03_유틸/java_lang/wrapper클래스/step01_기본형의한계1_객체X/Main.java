package _03_유틸.java_lang.wrapper클래스.step01_기본형의한계1_객체X;

/*
    - 기본형의 한계
        1) 객체가 아님
            : 기본형 데이터는 객체가 아니기 때문에, 객체 지향 프로그래밍의 장점을 살릴 수 없다.
              예를 들어 객체는 유용한 메서드를 제공할 수 있는데, 기본형은 객체가 아니므로 메서드를 제공할 수 없다.
              추가로 객체 참조가 필요한 컬렉션 프레임워크를 사용할 수 없고, 제네릭도 사용할 수 없다.

        2) null값을 가질 수 없다.
            : 때로는 데이터가 없음 이라는 상태를 나타내야 할 필요가 있는데, 기본형은 항상 값을 가지기 때문에 이런 표현을 할 수 없다.
*/

public class Main {
    public static void main(String[] args) {

        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }

    public static int compareTo(int value, int target) {
        if(value < target)
            return -1;
        else if(value > target)
            return 1;
        else
            return 0;
    }
    /*
        - value와 비교 대상 값을 외부 메서드를 사용해서 비교하고 있다.
          그런데 자신인 value와 다른 값을 연산하는 것이기 때문에 항상 자기 자신의 값인 value가 사용된다.
          이런 경우 만약 value가 객체라면 value객체 스스로 자기 자신의 값과 다른 값을 비교하는 메서드를 만드는 것이 더 유용할 것이다.
    */
}


