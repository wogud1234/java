package _01_OOP.ch03_클래스.다형성.형변환1;

public class Main {
    public static void main(String[] args) {

        Car car = null;
        FireEngine fe1 = new FireEngine();
        FireEngine fe2 = null;

        fe1.water();

        car = fe1;
        // car.water();
        fe2 = (FireEngine)car;	// 조상 타입의 참조변수로 자손 인스턴스의 멤버 호출 못 하니까 자손 타입의 참조변수로 변환~~
        fe2.water();

        System.out.println("\n---------------\n");

        Car car3 = new FireEngine();
        FireEngine fe3 = null;

        fe3 = (FireEngine)car3;		// OK
        fe3.water();

        System.out.println("\n---------------\n");

        Car car2 = new Car();
        FireEngine fe4 = null;

//		fe4 = (FireEngine)car2;		// ERROR) 컴파일은 OK지만, 실행 시 에러가 발생
//		fe4.water();				// 컴파일 시에는 참조변수간의 타입만 체크하기 때문에 실행 시 생성될 인스턴스의 타입에 대해서는 전혀 알지 못한다.
        // 그래서 참조변수가 가리키는 인스턴스의 타입이 무엇인지 확인하는 것이 중요하다 ==> instanceof 연산자

        System.out.println("\n---------------\n");

        FireEngine fe5 = new FireEngine();

		/*
		 	- 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있기 때문에, 참조변수의 타입과 인스턴스의 타입이 항상 일치하는 것은 아니다.
		 	  그런 경우에 실제 인스턴스와 같은 타입의 참조변수로 형변환을 해야만 인스턴스의 모든 멤버를 사용할 수 있다.
		*/

        // 참조변수 fe5가 현재 참조하고 있는 인스턴스가 뭔지 모르는 상황.....
        if(fe5 instanceof FireEngine) {
            System.out.println("This is a FireEngine instance");
        }
        if(fe5 instanceof Car) {
            System.out.println("This is a Car instance");
        }
        if(fe5 instanceof Object) {
            System.out.println("This is a Object instance");
        }
        // 어떤 타입에 대한 instanceof연산의 결과가 true라는 것은 검사한 타입으로 형변환이 가능하다는 것을 뜻한다. (부모-자식 관계라는 뜻이다!!!!)
        // fe5가 참조하고있는 인스턴스가 오른쪽 타입으로 형변환 가능하다는 것을 뜻한다.
        //      ==> 왼쪽이 오른쪽 보다 자식이거나, 같으면 true를 반환한다.
        System.out.println(fe5.getClass().getName());
    }
}
