package _01_OOP.step08_인터페이스_역할과구현.step02_역할구현분리;

public class K3Car implements ICar {
    @Override
    public void startEngine() {
        System.out.println("K3Car.startEngine");
    }
    @Override
    public void offEngine() {
        System.out.println("K3Car.offEngine");
    }
    @Override
    public void pressAcceleraotr() {
        System.out.println("K3Car.pressAccelerator");
    }
}
