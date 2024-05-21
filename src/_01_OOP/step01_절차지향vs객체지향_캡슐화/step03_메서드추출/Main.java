package _01_OOP.step01_절차지향vs객체지향_캡슐화.step03_메서드추출;

public class Main {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);

        volumeUp(data);

        volumeDown(data);

        showStatus(data);

        off(data);
    }

    private static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn)
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        else
            System.out.println("음악 플레이어 OFF");
    }

    private static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    private static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    private static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
}

/*
    - 중복 제거
        : 같은 로직이 필요하면 해당 메서드를 여러번 호출하면 된다.
    - 변경 영향 범위
        : 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
    - 메서드 이름 추가
        : 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.

    - 한계
        : 데이터와 기능이 분리되어 있다.
        : 음악 플레이어와 관련된 데이터는 MusicPlayerData를 사용해야 하고,
          음악 플레이어와 관련된 기능은 Main을 사용해야 한다.
        : 데이터와 그 데이터를 사용하는 기능은 매우 밀접하게 연관되어 있다.
          각각의 메서드를 보면 대부분 MusicPlayerData의 데이터를 사용한다.
          따라서 이후에 관련 데이터가 변경되면 Main부분의 메서드들도 함께 변경해야 한다.
          이렇게 데이터와 기능이 분리되어 있으면 유지보수 관점에서도 관리 포인트가 2곳으로 늘어난다.
*/