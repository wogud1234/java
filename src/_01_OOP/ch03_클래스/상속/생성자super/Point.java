package _01_OOP.ch03_클래스.상속.생성자super;

public class Point {

    int x, y;

    Point(int x, int y) {
        // <-- 생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 'super()'를 여기에 삽입한다. (Object클래스...)
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D extends Point {
    int z;

    //	Point3D(int x, int y, int z) {
    //		super();	// <- 컴파일러가 자동적으로 추가함 : Point클래스에는 기본 생성자가 없기 때문에 error 발생~~
    //		this.x = x;
    //		this.y = y;
    //		this.z = z;
    //	}
    Point3D(int x, int y, int z) {
        super(x, y);	// 조상 클래스의 멤버변수는 이처럼 조상의 생성자에 의해 초기화되도록 해야한다.
        this.z = z;
    }
    Point3D() {
        this(100, 200, 300);
    }
    String getLocation() {
        return "x: " + x + ", y: " + y + ", z: " + z;
    }
}
/*
 	- 모든 클래스의 생성자는 첫 줄에 반드시 자신의 다른 생성자 'this()' 또는 조상의 생성자 'super()'를 호출해야 한다.
 	  그렇지 않으면 컴파일러는 생성자의 첫 줄에 'super()'를 자동적으로 추가한다.
*/
