package _01_OOP.ch03_클래스.다형성.형변환2;

public class Vehicle {
    public void run() {

        System.out.println("차를 운전합니다~~~~\n");
    }
}
class Bus extends Vehicle {
    @Override
    public void run() {

        System.out.println("버스를 운전합니다.\n");
    }
    public void ride() {
        System.out.println("버스를 탑니다.");
    }
    public void checkFare() {
        System.out.println("승차요금을 체크합니다...");
    }
}
class ElectricBus extends Bus {
    @Override
    public void run() {

        System.out.println("전기 버스를 운전합니다.\n");
    }
    public void charge() {
        System.out.println("전기 충전..");
    }
}
class Taxi extends Vehicle {

    @Override
    public void run() {

        System.out.println("택시를 운전합니다.\n");
    }

    public void ride() {
        System.out.println("택시를 탑니다.");
    }
}
