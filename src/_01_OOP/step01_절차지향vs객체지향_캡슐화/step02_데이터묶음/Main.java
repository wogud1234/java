package _01_OOP.step01_절차지향vs객체지향_캡슐화.step02_데이터묶음;

public class Main {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);

        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn)
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        else
            System.out.println("음악 플레이어 OFF");

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
// 음악 플레이어와 관련된 변수들은 MusicPlayerData data 객체에 속해있으므로 쉽게 구분할 수 있다.