package _01_OOP.step09_내부클래스.정적중첩클래스;

public class Main {
    public static void main(String[] args) {

        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();
        System.out.println("nestedClass = " + nested.getClass());
        // nestedClass = class _01_OOP.step09_내부클래스.정적중첩클래스.NestedOuter$Nested
    }
}
