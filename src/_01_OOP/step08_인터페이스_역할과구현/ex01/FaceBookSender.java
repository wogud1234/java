package _01_OOP.step08_인터페이스_역할과구현.ex01;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String msg) {
        System.out.println("페이스북에 발송합니다: " + msg);
    }
}
