package _01_OOP.ch04_인터페이스.활용.결합.느슨한결합1;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.methodUser(new Provider());
        user.methodUser(new NewProvider());
    }
}
