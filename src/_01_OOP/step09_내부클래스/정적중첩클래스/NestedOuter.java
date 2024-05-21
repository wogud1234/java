package _01_OOP.step09_내부클래스.정적중첩클래스;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            System.out.println(nestedInstanceValue);                // 자신의 멤버에 접근

            //System.out.println(outInstanceValue);                 // error) 바깥 클래스의 인스턴스 멤버에는 접근 못함.

            System.out.println(NestedOuter.outClassValue);          // 바깥 클래스의 클래스 멤버에는 접근 가능. private에도 접근 가능
        }
    }
}

/*
    - 정적 중첩 클래스는 사실 다른 클래스를 그냥 중첩해 둔 것을 뿐이다.
      쉽게 이야기해서 둘은 아무런 관계가 없다.
      쉽게 이야기해서 아래 코드와 같이 정적 중첩클래스를 만들지 않고, 그냥 클래스 2개를 따로 만든것과 같다.
      아래 코드와 정적 중첩 클래스의 유일한 차이는 같은 클래스에 있으니 private 접근 제어자에 접근할 수 있다는 정도이다.

            class NestedOuter { }
            class Nested { }
*/