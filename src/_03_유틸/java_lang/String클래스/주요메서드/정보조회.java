package _03_유틸.java_lang.String클래스.주요메서드;

public class 정보조회 {
    public static void main(String[] args) {

        String str = "Hello, Java!";

        System.out.println("문자열의 길이: " + str.length());
        System.out.println("문자열이 비어 있는지?: " + str.isEmpty());
        System.out.println("문자열이 비어 있거나 공백인지?: " + str.isBlank());      // jdk11~
        System.out.println("문자열이 비어 잇거나 공백인지?: " + "  ".isBlank());

        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자: " + c);
    }
}
