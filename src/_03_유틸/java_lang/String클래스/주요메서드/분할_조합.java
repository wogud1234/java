package _03_유틸.java_lang.String클래스.주요메서드;

public class 분할_조합 {
    public static void main(String[] args) {

        String str = "Apple,Banana,Orange";

        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }
        System.out.println();
        
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("joinedStr = " + joinedStr);                 // joinedStr = A-B-C
        
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);                       // result = Apple-Banana-Orange
    }
}
