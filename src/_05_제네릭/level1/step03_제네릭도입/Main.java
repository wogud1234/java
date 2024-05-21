package _05_제네릭.level1.step03_제네릭도입;

public class Main {
    public static void main(String[] args) {
        
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.setValue(10);                                        // 캐스팅 필요 x
        Integer integer = integerBox.getValue();                        // 캐스팅 필요 x
        System.out.println("integer = " + integer);                     // 넣을 때와 뺄 때 타입이 같다 -> 타입 안정성!!!
        
        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println("str = " + str);

        GenericBox<Double> doubleBox = new GenericBox<>();      // 타입 추론
        doubleBox.setValue(3.412);
        Double d = doubleBox.getValue();
        System.out.println("d = " + d);
    }
}

/*
    - 제네릭을 도입한다고 해서 GenericBox<String> , GenericBox<Integer> 와 같은 코드가 실제 만들어지는 것은 아니다.
      대신에 자바 컴파일러가 우리가 입력한 타입 정보를 기반으로 이런 코드가 있다고 가정하고 컴파일 과정에 타입 정보를 반영한다.
      이 과정에서 타입이 맞지 않으면 컴파일 오류가 발생한다.

    - 자바가 스스로 타입 정보를 추론해서 개발자가 타입 정보를 생략할 수 있는 것을 타입 추론이라 한다.
      타입 추론이 그냥 되는 것은 아니고, 자바 컴파일러가 타입을 추론할 수 있는 상황에만 가능하다.
      쉽게 이야기해서 읽을 수 있는 타입 정보가 주변에 있어야 추론할 수 있다.
*/

/*
    - 제네릭의 핵심은 사용할 타입을 미리 결정하지 않는다는 점이다.
      클래스 내부에서 사용하는 타입을 클래스를 정의하는 시점에 결정하는 것이 아니라 실제 사용하는 생성 시점에 타입을 결정하는 것이다.
      이것을 쉽게 비유하자면 메서드의 매개변수와 인자의 관계와 비슷하다.

    - 제네릭(Generic) 단어
        : 제네릭이라는 단어는 일반적인, 범용적인이라는 영어 단어 뜻이다.
          풀어보면 특정 타입에 속한 것이 아니라 일반적으로, 범용적으로 사용할 수 있다는 뜻이다.

    - 제네릭 타입 (Generic Type)
        : 클래스나 인터페이스를 정의할 때 타입 매개변수를 사용하는 것을 말한다.
          제네릭 클래스, 제네릭 인터페이스를 모두 합쳐서 제네릭 타입이라 한다.
          타입은 클래스, 인터페이스, 기본형(int 등)을 모두 합쳐서 부르는 말이다.
                예: class GenericBox<T> { private T t; }
                여기에서 GenericBox<T> 를 제네릭 타입이라 한다.

    - 타입 매개변수 (Type Parameter)
        : 제네릭 타입이나 메서드에서 사용되는 변수로, 실제 타입으로 대체된다.
                예: GenericBox<T>
                여기에서 T 를 타입 매개변수라 한다.

    - 타입 인자 (Type Argument)
        : 제네릭 타입을 사용할 때 제공되는 실제 타입이다.
                예: GenericBox<Integer>
                여기에서 Integer 를 타입 인자라 한다.

    - 원시 타입(raw type)
        : 제네릭 타입을 사용할 때는 항상 <> 를 사용해서 사용시점에 원하는 타입을 지정해야 한다.
          그런데 다음과 같이 <> 을 지정하지 않을 수 있는데, 이런 것을 로 타입(raw type), 또는 원시 타입이라한다.
                GenericBox integerBox = new GenericBox();
          원시 타입을 사용하면 내부의 타입 매개변수가 Object 로 사용된다고 이해하면 된다.
*/













