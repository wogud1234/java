package _01_OOP.ch03_클래스.익명클래스.익명구현객체2;

public class Button {
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
