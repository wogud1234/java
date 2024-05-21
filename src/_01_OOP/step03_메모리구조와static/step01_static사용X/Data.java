package _01_OOP.step03_메모리구조와static.step01_static사용X;

public class Data {
    public String name;

    public Data(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }
}
