package _01_OOP.ch03_클래스.내부클래스.ex02_접근;

public class Outter {

    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv1 = outerIv;		// private도 사용 가능...
        int iiv2 = outerCv;
    }
    static class StaticInner {
        //		int siv = outerIv;			// error) 스태틱 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
        static int scv = outerCv;
    }
    void method() {
        int lv = 0;
        final int Lv = 0;

        class LocalInner {
            int liv1 = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;
            int liv4 = Lv;
        }
    }

    static void staticMethod() {
        StaticInner obj1 = new StaticInner();

//		InstanceInner obj2 = new InstanceInner();	// error) 스태틱 멤버는 인스턴스 멤버에 접근할 수 없다.
        // 굳이 접근하려면 아래와 같이 객체를 생성해야 한다.
        Outter outer = new Outter();
        InstanceInner obj2 = outer.new InstanceInner();
    }

    void instanceMethod1() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();			// error)
    }

    void instanceMethod2() {
        class LocalInner { }
        LocalInner lv = new LocalInner();
    }
}
