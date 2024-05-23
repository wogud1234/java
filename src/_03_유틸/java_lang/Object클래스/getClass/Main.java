package _03_유틸.java_lang.Object클래스.getClass;

/*
 				public final class Class implements ... {
 					...
				}

	- getClass()

		: 자신이 속한 클래스의 Class객체를 반환한다.
		: Class객체는 클래스의 모든 정보를 담고 있으며, 클래스 당 1개만 존재한다.
		  클래스 파일이 '클래스 로더'에 의해서 메모리에 올라갈 때, 자동으로 생성된다.
		: 클래스 로더는 실행 시에 필요한 클래스를 동적으로 메모리에 로드하는 역할을 한다.
		  먼저 기존에 생성된 클래스 객체가 메모리에 존재하는지 확인하고, 있으면 객체의 참조를 반환하고 없으면
		  클래스 패스에 지정된 경로를 따라서 클래스 파일을 찾는다.
		  못 찾으면 ClassNotFoundException이 발생하고, 찾으면 해당 클래스 파일을 읽어서 Class객체로 변환한다.
		  즉, 파일 형태로 저장되어 있는 클래스를 읽어서 Class클래스에 정의된 형식으로 변환하는 것이다.
		  즉, 클래스 파일을 읽어서 사용하기 편한 형태로 저장해 놓은 것이 클래스 객체이다.
*/

public class Main {

    public static void main(String[] args) {

        Class obj1 = new Card("HEARD", 3).getClass();       // 방법1) 생성된 객체로 부터 얻기
        Class obj2 = Card.class;                                         // 방법2) 클래스 리터럴로 부터 얻기

        try {
            Class obj3 = Class.forName("Card");                // 방법3) 클래스 이름으로 부터 얻기
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("obj1.getName() = " + obj1.getName());
        System.out.println("obj1.toGenericString() = " + obj1.toGenericString());
        System.out.println("obj1.toString() = " + obj1.toString());

        try {
            Card card = Card.class.newInstance();
            System.out.println("card = " + card);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
