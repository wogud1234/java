package _04_열거형.step04_열거형;

public class 참조값확인 {
    public static void main(String[] args) {

        System.out.println(Grade.BASIC.getClass());
        System.out.println(Grade.GOLD.getClass());
        System.out.println(Grade.DIAMOND.getClass());
        System.out.println();

        System.out.println(refValue(Grade.BASIC));
        System.out.println(refValue(Grade.GOLD));
        System.out.println(refValue(Grade.DIAMOND));
    }
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
/*
    - System.identityHashCode(grade)
        : 자바가 관리하는 객체의 참조값을 숫자로 반환한다.

    - Integer.toHexString()
        : 숫자를 16진수로 변환.
*/
