package _03_유틸.java_lang.Object클래스.불변객체_가변객체;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {

        int result = value + addValue;
        return new ImmutableObj(result);
    }

    public int getValue() {
        return value;
    }
}

/*
    - 기본형: 하나의 값을 여러 변수에서 절대로 공유하지 않는다.
    - 참조형: 하나의 객체를 참조값을 통해 여러 변수에서 공유할 수 있다.

    - 사이드 이펙트
        : 프로그래밍에서 어떤 계산이 주된 작업 외에 추가적인 부수 효과를 일으키는 것을 말한다.
          (프로그램의 특정 부분에서 발생한 변경이 의도치 않게 다른 부분에 영향을 미치는 경우 발생)

    - 사이드 이펙트 해결 방안
        1) 여러 변수가 하나의 객체를 공유하는 것을 막을 방법은 없으니, 하나의 객체를 공유하지 않도록 신경써서 코딩한다.
        2) 불변객체 사용
            : 사이드 이펙트의 근본적인 원인을 고려해보면, 객체를 공유하는 것 자체는 문제가 아니다.
              객체를 공유한다고 바로 사이드 이펙트가 발생하지는 않는다.
              문제의 직접적인 원인은 공유된 객체의 값을 변경하는 것에 있다.
              불변객체는 값을 변경할 수 없기 때문에 사이드 이펙트가 원천 차단된다.
              불변 객체의 값을 변경하고 싶다면 변경하고 싶은 값으로 새로운 불변 객체를 생성해야 한다.
              이렇게 하면 기존 변수들이 참조하는 값에는 영향을 주지 않는다.

    - withXXX() 메서드
        : 불변 객체에서 값을 변경하는 경우 withYear() 처럼 "with"로 시작하는 경우의 메서드가 많다.
          불변 객체의 메서드가 "with"로 이름이 지어진 경우, 그 메서드가 지정된 수정사항을 포함하는 객체의 새 인스턴스를 반환한다는 사실을 뜻한다.
          "with"는 관례처럼 사용되는데, 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포함하는 과정을 간결하게 표현한다.

    - 불변 객체 예
        : String, Integer, LocalDate, ....

    - 클래스를 불변으로 만드는 이유
        1) 캐시 안정성
        2) 멀티 쓰레드 안정성
        3) 엔티티의 값 타입

*/