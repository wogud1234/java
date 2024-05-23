package _03_유틸.java_lang.Object클래스.clone;

public class Circle implements Cloneable {

    private Point p;
    private double r;

    public Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch(CloneNotSupportedException e) {

        }
        return (Circle)obj;
    }

    public Circle deepCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch(CloneNotSupportedException e) {

        }
        Circle circle = (Circle)obj;
        circle.setP(new Point(p.getX(), p.getY()));

        return circle;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }
}
