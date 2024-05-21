package _01_OOP.ch04_인터페이스.중첩;

public class Button {

    // - 인터페이스를 클래스 내부에 선언하는 이유는 해당 클래스와 긴밀한 관계를 맺는 구현 객체를 만들기 위해서이다.
    public static interface ClickListener {

        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {

        this.clickListener = clickListener;
    }

    public void click() {

        this.clickListener.onClick();
    }
}
