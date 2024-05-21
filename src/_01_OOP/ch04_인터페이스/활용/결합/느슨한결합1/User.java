package _01_OOP.ch04_인터페이스.활용.결합.느슨한결합1;

public class User {
    void methodUser(I i) {
        i.methodProvider();
    }
}
/*
 	- 클래스 User2를 작성하는데 있어서 클래스 Provider, NewProvider이 사용되지 않았다는 점에 주목하자.
 	  이제 클래스 User와 클래스 Provider는 직접적인 관계에서 'User - i - Provider' 의 간접적인 관계로 바뀐 것이다.

 	- 결국 클래스 User는 여전히 클래스 Provider의 메서드를 호출하지만, 클래스 User는 인터페이스 I 하고만 직접적인 관계에 있기 때문에
 	  클래스 Provider의 변경에 영향을 받지 않는다.

 	- 클래스 User는 인터페이스를 통해 실제로 사용하는 클래스의 이름을 몰라도 되고 심지어는 실제로 구현된 클래스가 존재하지 않아도 문제가 되지 않는다.
 	  클래스 User는 오직 직접적인 관계에 있는 인터페이스 I의 영향만을 받는다.
*/