package _01_OOP.step01_절차지향vs객체지향_캡슐화.step05_캡슐화와접근제어자;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}
