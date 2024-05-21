package _03_유틸.java_lang.String클래스.주요메서드;

public class 비교 {
    public static void main(String[] args) {

        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println();

        System.out.println("b".compareTo("a"));                 // 1
        System.out.println(str1.compareTo(str3));               // 'J' - 'W' = -13
        System.out.println(str1.compareToIgnoreCase(str2));     // 0
        System.out.println();

        System.out.println(str1.startsWith("Hello"));       // true
        System.out.println(str1.endsWith("Java!"));         // true
    }
}
