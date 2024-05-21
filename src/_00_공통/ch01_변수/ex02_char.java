package _00_공통.ch01_변수;

public class ex02_char {
    public static void main(String[] args) {

        // 유니코드...
        char ch = 'A';
        int code = (int)ch;

        System.out.printf("%c = %d(%#X)\n", ch, code, code);

        char hch = '가';
        System.out.printf("%c = %d(%#X)\n", hch, (int)hch, (int)hch);

        char unicode = 44032;
        System.out.printf("%c = %d(%#x)\n", unicode, (int)unicode, (int)unicode);

		/*
		 	- println()은 변수의 타입이 정수형이면 변수에 저장된 값을 10진수로 해석하여 출력하고,
		 	  문자형이면 저장된 숫자에 해당하는 유니코드 문자를 출력한다.
		 	- 값은 어떻게 해석하느냐에 따라 결과가 달라지므로 값만으로는 값을 해석할 수 없다.
		*/
		/*
		 	- 문자 리터럴은 유니코드로 변환되어 저장되는데, 유니코드는 세계 각국의 문자를 0~65535 숫자로 매핑한 국제 표준 규약이다.
		 	  자바는 이러한 유니코드를 저장할 수 있도록 char타입을 제공한다.
		 	- 유니코드가 정수이므로 char타입도 정수 타입에 속한다.
		*/
    }
}
