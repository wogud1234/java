package _03_유틸.java_lang.wrapper클래스.step04_자바래퍼클래스;

public class 특징 {
    public static void main(String[] args) {

        Integer integerObj = Integer.valueOf(999);                         // -128 ~ 127 자주 사용하는 숫자 값은 재사용
        Integer integerObj2 = Integer.valueOf(999);        // 박싱

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("==내부 값 읽기==");
        int intValue = integerObj.intValue();               // 언박싱
        System.out.println("intValue = " + intValue);

        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);
        System.out.println();

        System.out.println("==비교==");
        System.out.println("==: " + (integerObj == integerObj2));               // -128 ~ 127 범위의 값이면 true
        System.out.println("equals: " + integerObj.equals(integerObj2));

    }
}

/*
    - 자바가 제공하는 기본 래퍼 클래스의 특징
        1) 불변 객체이다.
        2) equals()로 비교해야 한다.

    - Integer.valueOf(10);
        : 내부에서 new Integer(10)을 사용해서 객체를 생성하고 돌려준다.
        : 성능 최적화 기능이 있는데 자주 사용되는 -128 ~ 127 범위의 Integer클래스를 미리 생성해준다.
          해당 범위의 값을 조회하면 미리 생선된 Integer 객체를 반환하고, 해당 범위의 값이 없으면 new Integer()를 호출한다.
          (마치 문장려 풀과 비슷하게 자주 사용하는 숫자를 미리 생성해두고 재사용한다.)

    - 오토 박싱과 오토 언박싱은 컴파일러가 개발자 대신 valueOf(), xxxValue() 등의 코드를 추가해주는 기능이다.
      덕분에 기본형과 래퍼형을 서로 편리하게 변환할 수 있다.
*/
