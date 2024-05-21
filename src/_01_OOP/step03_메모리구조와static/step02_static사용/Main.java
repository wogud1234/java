package _01_OOP.step03_메모리구조와static.step02_static사용;

public class Main {
    public static void main(String[] args) {

        Data data1 = new Data("A");
        System.out.println("A count = " + Data.count);
        Data data2 = new Data("B");
        System.out.println("B count = " + Data.count);
        Data data3 = new Data("C");
        System.out.println("C count = " + Data.count);
    }
}
