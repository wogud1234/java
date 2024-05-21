package _05_제네릭.level2.step07_와일드카드;

import _05_제네릭.level2.animal.Animal;

public class WhildCard {

    static <T> void printGeneric1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static void printWhildCard1(Box<?> box) {
        System.out.println("? = " + box.get());
    }




    static <T extends Animal> void printGeneric2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWhildCard2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }




    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWhildCard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}

/*
    - 와일드카드1

        : 와일드카드라는 뜻은 컴퓨터 프로그래밍에서 * , ? 와 같이 하나 이상의 문자들을 상징하는 특수 문자를 뜻한다.
          쉽게 이야기해서 여러 타입이 들어올 수 있다는 뜻이다.

        : 와일드카드는 제네릭 타입이나, 제네릭 메서드를 선언하는 것이 아니다.
          와일드카드는 이미 만들어진 제네릭 타입을 활용할 때 사용한다.
          Box<Dog> , Box<Cat> 처럼 타입 인자가 정해진 제네릭 타입을 전달 받아서 활용할 때 사용한다.

        : 와일드카드인 ? 는 모든 타입을 다 받을 수 있다는 뜻이다.
          다음과 같이 해석할 수 있다. ? == <? extends Object>
          이렇게 ? 만 사용해서 제한 없이 모든 타입을 다 받을 수 있는 와일드카드를 비제한 와일드카드라 한다.
          여기에는 Box<Dog> dogBox , Box<Cat> catBox , Box<Object> objBox 가 모두 입력될 수 있다.

    - 제네릭 메서드 vs 와일드카드
        : printGeneric1() 제네릭 메서드를 보자.
          제네릭 메서드에는 타입 매개변수가 존재한다.
          그리고 특정 시점에 타입 매개변수에 타입 인자를 전달해서 타입을 결정해야 한다. 이런 과정은 매우 복잡하다.

        : 반면에 printWildcardV1() 메서드를 보자.
          와일드카드는 일반적인 메서드에 사용할 수 있고, 단순히 매개변수로 제네릭 타입을 받을 수 있는 것 뿐이다.
          제네릭 메서드처럼 타입을 결정하거나 복잡하게 작동하지 않는다.
          단순히 일반 메서드에 제네릭 타입을 받을 수 있는 매개변수가 하나 있는 것 뿐이다.

        : 제네릭 타입이나 제네릭 메서드를 정의하는게 꼭 필요한 상황이 아니라면, 더 단순한 와일드카드 사용을 권장한다.
*/

/*
    - 와일드카드2

        : 제네릭 메서드와 마찬가지로 와일드카드에도 상한 제한을 둘 수 있다.
          여기서는 ? extends Animal 을 지정했다.
          Animal 과 그 하위 타입만 입력 받는다. 만약 다른 타입을 입력하면 컴파일 오류가 발생한다.
          box.get() 을 통해서 꺼낼 수 있는 타입의 최대 부모는 Animal 이 된다. 따라서 Animal 타입으로 조회할 수 있다.
          결과적으로 Animal 타입의 기능을 호출할 수 있다.

    - 제네릭으로만 해결 가능한 문제

        : printAndReturnGeneric() 은 다음과 같이 전달한 타입을 명확하게 반환할 수 있다.
                Dog dog = Wildcard.printAndReturnGeneric(dogBox)

        : 반면에 printAndReturnWildcard() 의 경우 전달한 타입을 명확하게 반환할 수 없다.
          여기서는 Animal 타입으로 반환한다.
                Animal animal = Wildcard.printAndReturnWildcard(dogBox)

        : 메서드의 타입들을 특정 시점에 변경하려면 제네릭 타입이나, 제네릭 메서드를 사용해야 한다.
          와일드카드는 이미 만들어진 제네릭 타입을 전달 받아서 활용할 때 사용한다. 
          따라서 메서드의 타입들을 타입 인자를 통해 변경할 수 없다.
          쉽게 이야기해서 일반적인 메서드에 사용한다고 생각하면 된다.
          정리하면 제네릭 타입이나 제네릭 메서드가 꼭 필요한 상황이면 <T> 를 사용하고,
          그렇지 않은 상황이면 와일드카드를 사용하는 것을 권장한다.
*/























