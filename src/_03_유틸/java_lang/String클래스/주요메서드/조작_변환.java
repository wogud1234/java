package _03_유틸.java_lang.String클래스.주요메서드;

public class 조작_변환 {
    public static void main(String[] args) {

        String str = "Hello, Java! Welcome to Java";

        System.out.println(str.substring(7));                               // Java! Welcome to Java
        System.out.println(str.substring(7, 12));                                      // Java!
        System.out.println(str.concat("!!!!!"));                                   // Hello, Java! Welcome to Java!!!!!
        System.out.println(str.replace("Java", "World"));           // Hello, World! Welcome to World
        System.out.println(str.replaceFirst("Java", "World"));      // Hello, World! Welcome to Java

        System.out.println();

        String strWithSpaces = "      Java Programming   ";

        System.out.println(strWithSpaces.toLowerCase());
        System.out.println(strWithSpaces.toUpperCase());

        System.out.println("[" + strWithSpaces.trim() + "]");               // [Java Programming]
        System.out.println("[" + strWithSpaces.strip() + "]");              // [Java Programming]
        System.out.println("[" + strWithSpaces.stripLeading() + "]");       // [Java Programming   ]
        System.out.println("[" + strWithSpaces.stripTrailing() + "]");      // [      Java Programming]
    }
}
