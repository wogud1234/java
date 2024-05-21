package _01_OOP.ch02_초기화블럭;

class Television {

    static String company = "MyCompany";
    static String model = "LCD";
    public static String info;

    static {
        info = company + " - " + model;
    }
}

public class ex03_정적블록 {
    public static void main(String[] args) {

        System.out.println(Television.info);
    }
}
