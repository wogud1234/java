package _01_OOP.ch04_인터페이스.활용.결합.강한결합;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.methodUser(new Provider());
        // user.methodUser(new NewProvider());
    }
}
