package _03_유틸.java_lang.Object클래스.equals;

import java.util.Objects;

public class User {

    private String id;

    public User(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }
}

/*
    - 동일성(Identity)
        : == 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
          (완전히 같음을 의미)

    - 동등성(Equality)
        : equals() 메서드를 사용하여 두 객체가 논리적으로 동등한지 확인
          (같은 가치나 수준을 의미하지만 그 형태나 외관 등이 완전히 같지는 않을 수 있음을 의미)

    - equals()를 구현할 때 지켜야 하는 규칙
        1) 반사성 (Reflexivity)
            : 객체는 자기 자신과 동등해야 한다.

        2) 대칭성 (Symmetry)
            : 두 객체가 서로에 대해 동일하다고 판단하면, 이는 양방향으로 동일해야 한다.

        3) 추이성 (Transitivity)
            : 만약 한 객체가 두 번째 객체와 동일하고, 두 번째 객체가 세 번째 객체와 동일하다면,
              첫 번째 객체는 세 번째 객체와도 동일해야 한다.

        4) 일관성 (Consistency)
            : 두 객체의 상태가 변경되지 않는 한, equals()는 항상 동일한 값을 반환해야 한다.

        5) null에 대한 비교
            : 모든 객체는 null과 비교했을 때 false를 반환해야 한다.
*/