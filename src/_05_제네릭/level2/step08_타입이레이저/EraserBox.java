package _05_제네릭.level2.step08_타입이레이저;

public class EraserBox <T> {

    public boolean instanceCheck(Object param) {

        // return param instanceof T;       // error
        return false;
    }

    public void create() {

        // return new T();                  // error
    }
}

/*
    - 타입 이레이저
        : 제네릭은 자바 컴파일 단계에서만 사용되고, 컴파일 이후에는 제네릭 정보가 삭제된다.
          제네릭에 사용한 타입 매개변수가 모두 사라지는 것이다.
          쉽게 이야기해서 컴파일 전인 .java 에는 제네릭의 타입 매개변수가 존재하지만,
          컴파일 이후인 자바 바이트코드 .class 에는 타입 매개변수가 존재하지 않는 것이다.

        : 컴파일 이후에는 제네릭의 타입 정보가 존재하지 않는다.
          .class 로 자바를 실행하는 런타임에는 우리가 지정한 Box<Integer> , Box<String> 의 타입 정보가 모두 제거된다.
*/