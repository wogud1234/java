package _01_OOP.step09_내부클래스.내부클래스;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner{
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println(innerInstanceValue);

            System.out.println(outInstanceValue);

            System.out.println(InnerOuter.outClassValue);
        }
    }
}
