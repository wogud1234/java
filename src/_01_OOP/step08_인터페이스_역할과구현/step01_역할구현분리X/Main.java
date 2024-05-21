package _01_OOP.step08_인터페이스_역할과구현.step01_역할구현분리X;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();
    }
}
