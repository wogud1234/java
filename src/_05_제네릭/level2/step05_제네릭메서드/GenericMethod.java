package _05_제네릭.level2.step05_제네릭메서드;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("T print: " + t);
        return t;
    }

    public static <T extends Number> T boundedGenericMethod(T t) {
        System.out.println("bounded T print: " + t);
        return t;
    }
}

/*
    - 제네릭 타입
        : 정의
            -> GenericClass<T>
        : 타입 인자 전달
            -> 객체를 생성하는 시점
        : 예)
            -> new GenericClass<String>

    - 제네릭 메서드
        : 정의
            -> <T> T genericMethod(T t)
        : 타입 인자 전달
            -> 메서드를 호출하는 시점
        : 예)
            -> GenericMethod.<Integer>genericMethod(i)

        : 제네릭 메서드는 클래스 전체가 아니라 특정 메서드 단위로 제네릭을 도입할 때 사용한다.
        : 제네릭 메서드를 정의할 때는 메서드의 반환 타입 왼쪽에 다이아몬드를 사용해서 <T> 와 같이 타입 매개변수를 적어준다.
        : 제네릭 메서드는 메서드를 실제 호출하는 시점에 다이아몬드를 사용해서 <Integer> 와 같이 타입을 정하고 호출한다.
        : 제네릭 메서드의 핵심은 메서드를 호출하는 시점에 타입 인자를 전달해서 타입을 지정하는 것이다.
          따라서 타입을 지정하면서 메서드를 호출한다.
*/

//제네릭 타입
class Box<T> {

    static <V> V staticMethod2(V t) {           // static 메서드에 제네릭 메서드 도입
        return t;
    }

    <Z> Z instanceMethod2(Z z) {                // 인스턴스 메서드에 제네릭 메서드 도입 가능
        return z;
    }

    T instanceMethod(T t) {                     // 가능.
        return t;
    }

    // static T staticMethod(T t) { return t; } // static 메서드에는 제네릭 타입의 T 사용 불가능
}

/*
    - 주의
        : 제네릭 타입은 static 메서드에 타입 매개변수를 사용할 수 없다.
          제네릭 타입은 객체를 생성하는 시점에 타입이 정해진다.
          그런데 static 메서드는 인스턴스 단위가 아니라 클래스 단위로 작동하기 때문에 제네릭 타입과는 무관하다.
          따라서 static 메서드에 제네릭을 도입하려면 제네릭 메서드를 사용해야 한다.
*/















