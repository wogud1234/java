package _03_유틸.java_lang.String클래스.문자열풀;

public class Main {
    public static void main(String[] args) {

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + str1.equals(str2));
        System.out.println("메서드 호출 비교: " + isSame(str1, str2));
        System.out.println();

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + str3.equals(str4));
        System.out.println("메서드 호출 비교: " + isSame(str3, str4));
    }

    // 따라서 문자열 비교는 항상 equals()를 사용해서 동등성 비교를 해야 한다.
    private static boolean isSame(String x, String y) {
        return x == y;
    }
}
/*
    - String str3 = "hello";와 같이 문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다.
      자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String인스턴스를 미리 만들어 둔다. 이때 같은 문자열이 있으면 만들지 않는다.
    - 그 후에 String str3 = "hello";와 같이 문자열 리터럴을 사용하면 문자열 풀에서 "hello"라는 문자를 가진 String인스턴스를 찾는다.
      그리고 찾은 인스턴스의 참조(X003)을 반환한다.
      String str4 = "hello";의 경우 "hello"문자열 리터럴을 사용하므로 문자열 풀에서 str3과 같은 X003 참조를 사용한다.
    - 문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능도 최적화 할 수 있다.
    - 따라서 문자열 리터럴을 사용하는 경우 같은 참조값을 가지므로 == 비교에 성공한다.
    - 문자열 풀은 힙 영역을 사용한다. 그리고 문자열 풀에서 문자를 찾을 때는 해시 알고리즘을 사용하기 때문에 매우 빠른 속도로 원하는 String 인스턴스를 찾을 수 있다.
*/

