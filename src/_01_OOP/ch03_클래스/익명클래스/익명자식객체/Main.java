package _01_OOP.ch03_클래스.익명클래스.익명자식객체;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.run1();
        car.run2();

        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체3이 굴러갑니다.");
            }
        });
    }
}
