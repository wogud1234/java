package _01_OOP.step08_인터페이스_역할과구현.step02_역할구현분리;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setCar(k3Car);
        driver.drive();
        System.out.println();

        Sonata sonata = new Sonata();
        driver.setCar(sonata);
        driver.drive();
    }
}
