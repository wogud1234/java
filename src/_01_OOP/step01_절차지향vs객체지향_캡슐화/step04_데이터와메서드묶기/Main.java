package _01_OOP.step01_절차지향vs객체지향_캡슐화.step04_데이터와메서드묶기;

public class Main {
    public static void main(String[] args) {

        MusicPlayer data = new MusicPlayer();

        data.on();

        data.volumeUp();

        data.volumeUp();

        data.volumeDown();

        data.showStatus();

        data.off();
    }
}

