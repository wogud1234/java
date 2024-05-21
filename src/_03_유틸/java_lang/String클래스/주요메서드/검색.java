package _03_유틸.java_lang.String클래스.주요메서드;

public class 검색 {
    public static void main(String[] args) {

        String str = "Hello, Java! Welcome to Java World.";

        System.out.println(str.contains("Java"));                       // true
        System.out.println(str.indexOf("Java"));                        // 7
        System.out.println(str.indexOf("Java", 10));      // 24
        System.out.println(str.lastIndexOf("Java"));                // 24
    }
}
