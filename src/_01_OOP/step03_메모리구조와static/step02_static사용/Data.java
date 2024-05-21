package _01_OOP.step03_메모리구조와static.step02_static사용;

public class Data {

    public static int count;
    public String name;

    public Data(String name) {
        this.name = name;
        count++;
    }
}
