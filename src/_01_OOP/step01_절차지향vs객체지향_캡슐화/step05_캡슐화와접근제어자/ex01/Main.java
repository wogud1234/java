package _01_OOP.step01_절차지향vs객체지향_캡슐화.step05_캡슐화와접근제어자.ex01;

public class Main {
    public static void main(String[] args) {

        MaxCounter counter = new MaxCounter(3);

        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        int count = counter.getCount();
        System.out.println(count);
    }
}
