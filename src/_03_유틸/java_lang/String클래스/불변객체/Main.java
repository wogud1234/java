package _03_유틸.java_lang.String클래스.불변객체;

public class Main {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = str1.concat(" java");     // 불변 객체....

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
/*
    - String이 불변으로 설계된 이유
        : String은 자바 내부에서 문자열 풀을 통해 최적화를 한다.
          만약 String 내부의 값을 변경할 수 있다면, 기존에 문자열 풀에서 같은 문자를 참조하는 변수의 모든 문자가
          함께 변경되어 버리는 문제(사이드 이펙트)가 발생한다.
        : String 클래스는 불변으로 설계되어서 이런 사이드 이펙트 문제가 발생하지 않는다.
*/
