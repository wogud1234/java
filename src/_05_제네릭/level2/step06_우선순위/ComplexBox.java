package _05_제네릭.level2.step06_우선순위;

import _05_제네릭.level2.animal.Animal;

public class ComplexBox <T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("animal.className: " + animal.getClass());
        return t;
    }
}

/*
    - 제네릭 타입과 제네릭 메서드의 우선순위
        : 정적 메서드는 제네릭 메서드만 적용할 수 있지만, 인스턴스 메서드는 제네릭 타입도 제네릭 메서드도 둘다 적용할 수 있다.
          이 때,  제네릭 타입과 제네릭 메서드의 타입 매개변수를 같은 이름으로 사용하면 어떻게 될까?

        : 제네릭 타입보다 제네릭 메서드가 높은 우선순위를 가진다.
          따라서 printAndReturn() 은 제네릭 타입과는 무관하고 제네릭 메서드가 적용된다.

        : 여기서 적용된 제네릭 메서드의 타입 매개변수 T 는 상한이 없다. 따라서 Object 로 취급된다.
          Object 로 취급되기 때문에 t.getName() 과 같은 Animal 에 존재하는 메서드는 호출할 수 없다.

        : 참고로 프로그래밍에서 이렇게 모호한 것은 좋지 않다.
          둘의 이름이 겹치면 다음과 같이 둘 중 하나를 다른 이름으로 변경하는 것이 좋다.

             public <Z> Z printAndReturn(Z z) {
                //...
             }
*/