package _01_OOP.step08_인터페이스_역할과구현.step01_역할구현분리X;

public class Driver {

    private K3Car k3Car;
    private Sonata sonata;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }
    public void setSonata(Sonata sonata) {
        this.sonata = sonata;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다~~~~");

        if(k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAcceleraotr();
            k3Car.offEngine();
        } else if(sonata != null) {
            sonata.startEngine();
            sonata.pressAcceleraotr();
            sonata.offEngine();
        }
    }
}
