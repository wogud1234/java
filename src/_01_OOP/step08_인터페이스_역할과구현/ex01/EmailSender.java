package _01_OOP.step08_인터페이스_역할과구현.ex01;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String msg) {
        System.out.println("메일을 발송합니다: " + msg);
    }
}
