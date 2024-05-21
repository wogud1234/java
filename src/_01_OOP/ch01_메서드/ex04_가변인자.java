package _01_OOP.ch01_메서드;

/*
    - JDK1.5 부터 매개변수를 동적으로 지정해 줄 수 있게 되었다.

            public PrintStream printf(String format, Object... args) { ... }

    - 가변인자 외에도 매개변수가 더 있다면, 가변인자를 매개변수 중에서 제일 마지막에 선언해야 한다. 그렇지 않으면 컴파일 에러 발생....
      컴파일러가 가변인자인지 아닌지를 구별할 방법이 없기 때문이다.

    - 가변인자 매개변수를 갖고있는 메서드를 호출 할 때 인자로 배열도 쓸수가 있다.
      가변인자는 내부적으로 배열을 이용하는 것이기 때문이다. 그래서 가변인자가 선언된 메서드를 호출할 때마다 배열이 새로 생성된다.
      가변인자가 편리하지만 이런 비효율이 숨어있으므로 꼭 필요한 경우에만 가변인자를 사용해야 한다.
*/
public class ex04_가변인자 {
    public static void main(String[] args) {

        String[] strArr = { "100", "200", "300" };

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(", ", new String[] {"1", "2", "3"}));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("[" + concatenate(", ") + "]");
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for(String str : args)
            result += str + delim;

        return result;
    }
	/*
		static String concatenate(String... args) { return concatenate("", args); }
            : 가변인자를 선언한 메서드를 오버로딩하면, 메서드를 호출했을 때 구별되지 못하는 경우가 발생하기 쉽기 때문에,
              가능하면 가변인자를 사용한 메서드는 오버로딩하지 않는 것이 좋다.
	*/
}


