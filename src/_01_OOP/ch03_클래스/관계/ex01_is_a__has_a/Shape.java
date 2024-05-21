package _01_OOP.ch03_클래스.관계.ex01_is_a__has_a;

public class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]\n", color);
    }
}

class Point {
    int x, y;
    Point() {
        this(0, 0);
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    String getXY() {
        return "(" + x + ", " + y + ")";
    }
}

class Circle extends Shape {		// is-a
    Point center;					// has-a
    int r;
    Circle() {
        this(new Point(), 100);
    }
    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }
    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s]\n", center.x, center.y, this.r, color);
    }
}

class Triangle extends Shape {
    Point[] p;
    Triangle(Point[] p) {
        this.p = p;
    }
    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]\n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}
