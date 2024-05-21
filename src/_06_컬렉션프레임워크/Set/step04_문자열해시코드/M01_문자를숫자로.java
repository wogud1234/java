package _06_컬렉션프레임워크.Set.step04_문자열해시코드;

public class M01_문자를숫자로 {

    public static final int CAPACITY = 10;

    public static void main(String[] args) {

        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + charA);
        System.out.println("charB = " + charB);

        System.out.println();

        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"B\") = " + hashCode("B"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB"));

        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(hashCode(\"B\")) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(hashCode(\"AB\")) = " + hashIndex(hashCode("AB")));
    }

    private static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray)
            sum += c;
        return sum;
    }

    private static int hashIndex(int value) {
        return value % CAPACITY;
    }
}

/*
    - 해시 함수
        : 임이의 길이의 데이터를 입력으로 받아, 고정된 길이의 해시값(해시 코드)을 출력하는 함수
          여기서 의미하는 고정된 길이는 저장 공간의 크기를 뜻한다.
          예를 들어서 int형 1, 100 은 둘 다 4byte를 차지하는 고정된 길이를 뜻한다.
        : 같은 데이터를 입력하면 항상 같은 해시 코드가 출력된다.
        : 다른 데이터를 입력해도 같은 해시 코드가 출력될 수 있다. 이것을 해시 충돌이라 한다.

    - 해시 충돌 예
        "BC"    -> 133
        "AD"    -> 133

    - 해시 코드
        : 데이터를 대표하는 값. 보통 해시 함수를 통해 만들어진다.
            데이터  A의 해시 코드는 65
            데이터  B의 해시 코드는 66
            데이터 AB의 해시 코드는 131

    - 해시 인덱스
        : 해시 인덱스는 데이터의 저장 위치를 결정하는데, 주로 해시 코드를 사용해서 만든다.
        : 보통 해시 코드의 결과에 배열의 크기를 나누어 구한다.

    - 정리
        : 해시 코드는 데이터를 대표하는 값, 해시 함수는 이러한 해시 코드를 생성하는 함수, 해시 인덱스는 해시 코드를 사용해서 데이터의 저장 위치를 결정하는 값을 뜻한다.
        : 세상의 어떤 객체든지 정수로 만든 해시 코드만 정의할 수 있다면 해시 인덱스를 사용할 수 있다.
          그렇다면 문자 뿐만 아니라 내가 직접 만든 객체는 어떻게 해시 코드를 정의할 수 있을까???

*/
