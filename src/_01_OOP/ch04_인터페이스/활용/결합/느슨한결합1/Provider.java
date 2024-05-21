package _01_OOP.ch04_인터페이스.활용.결합.느슨한결합1;

public class Provider implements I {
    public void methodProvider() {
        System.out.println("methodProvider()~~");
    }
}
class NewProvider implements I {
    public void methodProvider() {
        System.out.println("methodNewProvider()~~");
    }
}