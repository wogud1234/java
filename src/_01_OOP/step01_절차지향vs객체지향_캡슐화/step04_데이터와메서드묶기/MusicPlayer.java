package _01_OOP.step01_절차지향vs객체지향_캡슐화.step04_데이터와메서드묶기;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if(isOn)
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        else
            System.out.println("음악 플레이어 OFF");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
}
/*
    - 음악 플레이어를 사용하는데 필요한 모든 속성과 기능이 하나의 클래스에 포함되어 있다.
      이제 음악 플레이어가 필요한 곳에서 이 클래스만 있으면 온전한 음악 플레이어를 생성해서 사용할 수 있다.

    - 음악 플레이어를 만들어서 제공하는 개발자와 음악 플레이어를 사용하는 개발자가 분리되어 있다고 생각하자.

    - MusicPlayer를 사용하는 입장에서는 이제 MusicPlayer의 데이터는 전혀 사용하지 않는다.
      MusicPlayer를 사용하는 입장에서는 이제 MusicPlayer 내부에 어떤 속성(데이터)이 있는지 전혀 몰라도 된다.
      단순하게 MusicPlayer가 제공하는 기능 중 필요한 기능을 호출해서 사용하기만 하면 된다.

    - 캡슐화
        : 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라고 한다.

    - 정리
        : 객체 지향 프로그래밍 덕분에 음악 플레이어 객체를 사용하는 입장에서 진짜 음악 플레이어를 만들고 사용하는 것처럼
          친숙하게 느껴진다.
          그래서 코드가 더 읽기 쉬운 것은 물론이고, 속성과 기능이 한 곳에 있기 때문에 변경도 더 쉬워진다.
          예를 들어, MusicPlayer 내부 코드가 변하는 경우에 다른 코드는 변경하지 않아도 된다.
          MusicPlayer의 volume이라는 필드 이름이 다른 이름으로 변한다고 할 때도 MusicPlayer 내부만 변경하면 된다.
          또 음악플레이어가 내부에서 출력하는 메시지를 변경할 때에도 MusicPlayer 내부만 변경하면 된다.
          이 경우 MusicPlayer를 사용하는 개발자는 코드를 전혀 변경하지 않아도 된다.
          물론 외부에서 호출하는 MusicPlayer의 메서드 이름을 변경한다면 MusicPlayer를 사용하는 곳의 코드도 변경해야 한다.


*/


















