package _00_공통.ch02_연산자;

public class ex02_casting {
    public static void main(String[] args) {

        char a = 'a';
        char d = 'd';
        char zero = '0';
        char two = '2';

        System.out.printf("'%c' - '%c' = %d\n", d, a, d - a);
        System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero);

        System.out.printf("'%c' = %d\n", a, (int)a);
        System.out.printf("'%c' = %d\n", d, (int)d);
        System.out.printf("'%c' = %d\n", zero, (int)zero);
        System.out.printf("'%c' = %d\n", two, (int)two);
		/*
		 	문자		코드
		 	'0'		48
		 	'A'		65
		 	'a'		97
		*/

        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1;			// 98

        c3 = (char)(c1 + 1);	// 'b'
        c2++;
        c2++;

        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        char c4 = 'a';

//		char c5 = c4 + 1;	// 컴파일error) c4++ 대신에 이렇게 하면 에러 발생 => 연산 결과인 int형을 char 형의 변수에 대입하려 하기 때문에... (명시적 형변환 필요)

        char c5 = 'a' + 1;	// OK
		/*
		 	- 위줄 코드와 달리 에러가 안 나는 이유
		 		상수 또는 리터럴 간의 연산은 실행 과정동안 변하는 값이 아니기 때문에, 컴파일 시에 컴파일러가 계산해서 그 결과로 대체함으로써 코드를 보다 효율적으로 만든다.
		 		컴파일러가 미리 덧셈연산을 수행하기 때문에 실행 시에는 덧셈 연산이 수행되지 않는다. 그저 미리 연산한 덧셈 결과를 c5에 저장할 뿐이다.

		 		그러나 윗줄 코드 같은 경우 처럼 수식에 변수가 들어가 있는 경우에는 컴파일러가 미리 계산을 할 수 없기 때문에 명시적으로 형변환 해주어야 한다.

		 		일부러 뻔 한 리터럴 연산을 풀어서 쓸 필요는 없지만, 코드의 가독성과 유지보수를 위해 그렇게 하는 경우가 있다.
		 			ex) 하루는 86400초 ==> 60 * 60 * 24
		 		이렇게 풀어서 써도 결국 컴파일러에 의해서 미리 계산되기 때문에 실행 시의 성능 차이는 없다.
		*/

        System.out.println("\n----------------\n");

        char lowerCase = 'a';
        char upperCase = (char)(lowerCase - 32);
        System.out.println(upperCase);

        System.out.println("\n----------------\n");

        float pi = 3.141692f;
        float shortPi = (int)(pi * 1000) / 1000f;	// 소수점 3자리까지 표현하기
        System.out.println(shortPi);

        shortPi = (int)(pi * 1000 + 0.5) / 1000f;	// 소수점 3번째 자리에서 반올림
        System.out.println(shortPi);

        shortPi = Math.round(pi * 1000) / 1000f;	// round() -> 소수점 첫째자리에서 반올림 후 그 결과를 정수로 반환
        System.out.println(shortPi);

        System.out.println("\n----------------\n");

        System.out.println(-10 % 8);
        System.out.println(10 % 8);
        System.out.println(-10 % -8);
        System.out.println(-10 % 0.0);
        System.out.println(-10 % 0);
        // 나누는 수로 음수도 허용하지만 0은 사용할 수 없다.
    }
}
