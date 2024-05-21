package _01_OOP.ch03_클래스.다형성.형변환2;

public class Main {

    public static void main(String[] args) {

        ride(new ElectricBus());
        ride(new Taxi());
    }

    public static void ride(Vehicle v) {

        // v가 참조하고있는 인스턴스가 Bus타입이거나, Bus타입의 자손이면 true...
        if(v instanceof Bus) {
            Bus bus = (Bus)v;
            bus.checkFare();
            bus.run();
        } else if(v instanceof Taxi taxi) {
            taxi.run();
        }

    }
}
