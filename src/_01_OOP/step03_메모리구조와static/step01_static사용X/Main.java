package _01_OOP.step03_메모리구조와static.step01_static사용X;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data data1 = new Data("A", counter);
        System.out.println("A count = " + counter.count);

        Data data2 = new Data("B", counter);
        System.out.println("B count = " + counter.count);

        Data data3 = new Data("C", counter);
        System.out.println("C count = " + counter.count);
    }
}
