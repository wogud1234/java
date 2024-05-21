package _01_OOP.ch04_인터페이스.구성.일반.ex02;

public class Tv implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다....");
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVolume(int volume) {

    }
}
