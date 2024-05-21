package _01_OOP.ch04_인터페이스.구성.일반.ex02;

public class Audio implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다...");
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVolume(int volume) {

    }
}
