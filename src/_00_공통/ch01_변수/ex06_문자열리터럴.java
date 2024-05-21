package _00_공통.ch01_변수;

public class ex06_문자열리터럴 {
    public static void main(String[] args) {

        /*
		 	- Java13 부터는 큰따옴표 3개로 문자열 리터럴을 감싸면 이스케이프하거나 라인피드를 할 필요가 없이,
		 	  작성된 그대로 문자열로 저장된다.
		*/
        String str1 = """
						{
							"id": "winter",
							"name": "눈송이"
						}
					""";

        System.out.println(str1);

        System.out.println();

        String str2 = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";

        System.out.println(str2);

		/*
		 	- 테스트 블록에서 줄바꿈은 \n에 해당한다. 만약 줄바꿈을 하지 않고 다음 줄에 이어서 작성하고 싶다면
		 	  23라인처럼 맨 끝에 \를 붙여주면 된다. 이 기능은 java14 부터 제공된다.
		*/
    }
}
