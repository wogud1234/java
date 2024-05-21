package _03_유틸.java_lang.wrapper클래스.step03_기본형의한계2_null사용x;

import _03_유틸.java_lang.wrapper클래스.step02_래퍼클래스만들기.MyInteger;

public class 래퍼 {
    public static void main(String[] args) {

        MyInteger[] intArr = { new MyInteger(-1), new MyInteger(0), new MyInteger(1)};

        System.out.println(findValue(intArr, -1));      // -1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));     // null
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if(myInteger.getValue() == target)
                return myInteger;
        }
        return null;
    }
}
