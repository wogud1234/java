package _01_OOP.step08_인터페이스_역할과구현.ex01;

public class Main {
    public static void main(String[] args) {

        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!!");
        }
    }
}
