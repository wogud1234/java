package _00_공통.ch04_배열;

public class ex03_문자열과문자 {
    public static void main(String[] args) {

        /*
		 	- char형 배열과 String 클래스의 중요한 차이는 String 객체(문자열)는 읽을수만 있을 뿐 내용을 변경할 수 없다는 것이다.
		*/

        String src = "ABCDE";

        for(int i=0 ; i<src.length() ; i++) {
            char ch = src.charAt(i);
            System.out.println("src.charAt(" + i + "): " + ch);
        }

        char[] chArr = src.toCharArray();		// String 객체 -> char형 배열
        System.out.println(chArr);
    }
}
