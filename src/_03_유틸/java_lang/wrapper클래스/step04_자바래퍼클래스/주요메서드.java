package _03_유틸.java_lang.wrapper클래스.step04_자바래퍼클래스;

public class 주요메서드 {
    public static void main(String[] args) {
        
        Integer i1 = Integer.valueOf(10);           //  숫자     , 래퍼 객체를 반환
        Integer i2 = Integer.valueOf("10");        // 문자열     , 래퍼 객체를 반환
        int intValue = Integer.parseInt("10");     // 문자열 전용, 기본형을 반환
        
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
