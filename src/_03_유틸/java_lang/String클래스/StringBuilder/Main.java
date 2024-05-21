package _03_유틸.java_lang.String클래스.StringBuilder;

/*
    - 불변인 String클래스의 단점은 문자를 더하거나 변경할 때 마다 계속해서 새로운 객체를 생성해야 한다는 점이다.

    - 이 문제를 해결하는 방법은, 불변이 아닌 가변 String이 존재하면 된다.
      가변은 내부의 값을 바로 변경하면 되기 때문에 새로운 객체를 생성할 필요가 없다.
      따라서 성능과 메모리 사용면에서 불변보다 더 효율적이다.

    - 단, 사이드 이펙트에 주의해야 한다.
      StringBuilder는 보통 문자열을 변경하는 동안만 사용하다가 문자열 변경이 끝나면 안전한(불변) String으로 변환하는 것이 좋다.
*/

public class Main {
    public static void main(String[] args) {

        {
            StringBuilder sb = new StringBuilder();
            sb.append("A");
            sb.append("B");
            sb.append("C");
            sb.append("D");
            System.out.println("sb = " + sb);

            sb.insert(4, "Java");
            System.out.println("insert = " + sb);

            sb.delete(4, 8);
            System.out.println("delete = " + sb);

            sb.reverse();
            System.out.println("reverse = " + sb);

            String str = sb.toString();
            System.out.println("str = " + str);
        }
        System.out.println();

        {
            StringBuilder sb = new StringBuilder();
            String str = sb.append("A").append("B").append("C").append("D")
                    .insert(4, "Java")
                    .delete(4, 8)
                    .reverse()
                    .toString();

            System.out.println("str = " + str);
        }
    }
}


