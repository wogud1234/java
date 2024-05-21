package _01_OOP.ch03_클래스.익명클래스.익명구현객체1;

public class Home {

    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다...");
        }
        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다...");
        }
    };

    public void use1() {
        rc.turnOn();		// 1. 필드 이용
        rc.turnOff();
    }

    public void use2() {

        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }
            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        rc.turnOn();		// 2. 로컬 변수 이용
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {	// 3. 매개변수 이용
        rc.turnOn();
        rc.turnOff();
    }
}
