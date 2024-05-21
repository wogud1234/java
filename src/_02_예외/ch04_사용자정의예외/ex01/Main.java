package _02_예외.ch04_사용자정의예외.ex01;

public class Main {
    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        try {
            account.withdraw(30000);
        } catch(InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
