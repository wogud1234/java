package _03_유틸.java_lang.Object클래스.clone;

public class Main_shallow_deep {
    public static void main(String[] args) {

        Circle c1 = new Circle(new Point(1, 1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println();

        System.out.println("===값 변경 후===");
        c1.getP().setX(9);
        c1.getP().setY(9);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
