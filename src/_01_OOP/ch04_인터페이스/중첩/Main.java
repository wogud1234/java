package _01_OOP.ch04_인터페이스.중첩;

public class Main {
    public static void main(String[] args) {

        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("OK 버튼 클릭!!!");
            }
        }

        btnOk.setClickListener(new OkListener());

        btnOk.click();

        System.out.println("\n");

        Button btnCancel = new Button();

        class CancelListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("Cancel 버튼 클릭!!!");
            }
        }

        btnCancel.setClickListener(new CancelListener());

        btnCancel.click();
    }
}
