package _01_OOP.ch03_클래스.익명클래스.익명구현객체1;

public class Main {
    public static void main(String[] args) {

        Home home = new Home();

        home.use1();
        System.out.println();

        home.use2();
        System.out.println();

        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("난방을 켭니다.");
            }
            @Override
            public void turnOff() {
                System.out.println("난방을 끕니다.");
            }
        });
    }
}
