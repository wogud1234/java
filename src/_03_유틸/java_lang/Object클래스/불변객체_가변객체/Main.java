package _03_유틸.java_lang.Object클래스.불변객체_가변객체;

public class Main {
    public static void main(String[] args) {

        MutableObj obj1 = new MutableObj(10);
        obj1.add(20);       // 계산 이후 기존값(obj1.value)은 사라짐

        System.out.println("obj.getValue() = " + obj1.getValue());

        System.out.println();

        ImmutableObj obj2 = new ImmutableObj(10);
        ImmutableObj obj3 = obj2.add(20);       // 계산 이후 기존값(obj2.value)은 남아있음

        System.out.println("obj2.getValue() = " + obj2.getValue());
    }
}
