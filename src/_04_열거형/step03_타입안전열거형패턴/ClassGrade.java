package _04_열거형.step03_타입안전열거형패턴;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // 외부에서 이 클래스를 생성 못하도록 막아 놓는다.
    //  -> 새로운 유형의 인스턴스를 생성하는 것은 이 클래스 내부에서만 할 수 있다.
    private ClassGrade() {
    }
}
/*
    - static을 사용해서 상수를 메서드 영역에 선언한다.
    - final을 사용해서 인스턴스(참조값)를 변경할 수 없게 한다.

    - 각각의 상수마다 별도의 인스턴스를 생성하고, 생성한 인스턴스를 대입한다.
*/