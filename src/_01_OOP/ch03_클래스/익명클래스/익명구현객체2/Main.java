package _01_OOP.ch03_클래스.익명클래스.익명구현객체2;

public class Main {
    public static void main(String[] args) {

        Button btnOk = new Button();

        btnOk.setClickListener(new Button.ClickListener() {

            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        });

        btnOk.click();

        System.out.println();

        Button btnCancel = new Button();

        btnCancel.setClickListener(new Button.ClickListener() {

            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        });

        btnCancel.click();
    }
}
