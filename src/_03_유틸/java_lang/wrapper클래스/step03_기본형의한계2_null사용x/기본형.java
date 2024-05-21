package _03_유틸.java_lang.wrapper클래스.step03_기본형의한계2_null사용x;

public class 기본형 {
    public static void main(String[] args) {

        int[] intArr = { -1, 0, 1, 2, 3 };
        System.out.println(findValue(intArr, -1));      // -1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));     // -1
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if(value == target)
                return value;
        }
        return -1;
    }
    /*
        - 입력값이 -1일때, 배열에 -1 값이 있어서 -1을 반환한 것인지, 아니면 -1값이 없어서 -1을 반환한 것인지 명확하지 않다.
    */
}
