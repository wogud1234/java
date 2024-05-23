package _03_유틸.java_lang.Object클래스.hashCode;

/*
 	- hashCode()는 해싱기법에 사용되는 '해시함수'를 구현한 것이다.
 	  해싱은 데이터관리기법 중의 하나인데 다량의 데이터를 저장하고 검색하는데 유용하다.
 	  해시함수는 찾고자하는 값을 입력하면, 그 값이 저장된 위치를 알려주는 해시코드를 반환한다.

 	- 일반적으로 해시코드가 같은 두 객체가 존재하는 것이 가능하지만, Object클래스에 정의된 hashCode()는 객체의 주소값으로 해시코드를 만들어 반환하기 때문에
 	  32bit JVM에서는 서로 다른 두 객체는 결코 같은 해시코드를 가질 수 없었지만, 64bit JVM에서는 8byte 주소값으로 해시코드(4byte)를 만들기 때문에
 	  해시코드가 중복될 수 있다.

 	- 클래스의 인스턴스변수 값으로 객체의 같고 다름을 판단해야하는 경우라면 equals()뿐 아니라 hashCode()도 적절히 오버라이딩 해야한다.
 	  같은 객체라면 hashCode()를 호출했을 때의 결과값인 해시코드도 같아야 하기 때문이다.
*/
/*
    - String클래스는 문자열의 내용이 같으면, 동일한 해시코드를 반환하도록 hashCode()가 오버라이딩되어 있기 때문에, 문자열의 내용이 같은 str1과 str2에 대해
      hashCode()를 호출하면 항상 동일한 해시코드값을 얻는다.

    - identityHashCode()는 Object클래스의 hashCode()처럼 객체의 주소값으로 해시코드를 생성하기 때문에 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장한다.

    - Object클래스에 정의된 toString()

 			public String toString() {
 				return getClass().getName() + "@" + Integer.toHexString(hashCode());
			}
*/
public class Main {
    public static void main(String[] args) {

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());
        System.out.println();

        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));
        System.out.println("Integer.toHexString(System.identityHashCode(str1)) = " + Integer.toHexString(System.identityHashCode(str1)));
        System.out.println("Integer.toHexString(System.identityHashCode(str2)) = " + Integer.toHexString(System.identityHashCode(str2)));
    }
}
