package _01_OOP.ch04_인터페이스.구성.일반.ex02;

public interface RemoteControl {

    // 1. 상수 필드
    public static final int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;		// 인터페이스에 선언된 필드는 모두 public static final 특성을 갖기 때문에 이를 생략하더라도 자동적으로 컴파일 과정에서 붙게된다.

    // 2. 추상 메소드
    public abstract void turnOn();
    void turnOff();								// public abstract를 생략하더라도 컴파일 과정에서 자동적으로 붙게된다.
    void setVolume(int volume);

	/*
	 	- 구현 클래스에서 추상 메서드를 재정의할 때 주의할 점은 인터페이스의 추상 메소드는 기본적으로 public 접근 제한을 갖기 때문에
	 	  public 보다 더 높은 접근 제한으로 재정의할 수 없다.
	*/

    /*
         3. 디폴트 메서드
             : 구현부 있음...
             : 구현 클래스는 디폴트 메소드를 재정의해서 자신에게 맞게 수정할 수도 있다. (오버라이딩 가능)
               재정의 시 주의할 점은 public 접근 제한자를 반드시 붙여야 하고, default 키워드를 생략해야 한다.
    */
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    // 4. 정적 메소드
    static void changeBattery() {
        System.out.println("리모콘 건전지를 교환합니다.");
    }

    // 5. private 메소드
    private void defaultCommon() {
        System.out.println("디폴트 메소드와 정적 메소드들의 중복 코드를 줄이기 위해 사용된다.");
    }

    // 6. private static 메소드
    private static void staticCommon() {
        System.out.println("...");
    }
}
