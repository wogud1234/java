package _03_유틸.java_lang.Object클래스.clone;

/*
			 	public class Object {
			 		...
			 		protected native Object clone() throws CloneNotSupportedException;
			 		...
				}

	- clone()을 사용하려면, 먼저 복제한 클래스가 Cloneable인터페이스를 구현해야하고,
	  clone()을 오버라이딩하면서 접근 제어자를 protected에서 public으로 변경한다.
	  그래야만 상속관계가 없는 다른 클래스에서 clone()을 호출 할 수 있다.
*/

public class Point implements Cloneable {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 공변 반환타입 - JDK1.5부터 오버라이딩할 때 조상 메서드의 반환타입을 자손 클래스의 타입으로 변경이 가능하다 -> 사용자가 형변환하는 작업을 줄여준다.
    @Override
  //public Object clone() {
    public Point  clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch(CloneNotSupportedException e) {

        }
        return (Point)obj;
    }

    @Override
    public String toString() {
        return "p(" + x + ", " + y + ") ";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
