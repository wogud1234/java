package _01_OOP.ch04_인터페이스.활용.결합.강한결합;

/*
 	- 클래스를 사용하는 쪽(User)과 클래스를 제공하는 쪽(Provider)이 있다.
 	- 메서드를 사용(호출)하는 쪽(User)에서는 사용하려는 메서드(Provider)의 선언부만 알면 된다.(내용은 몰라도 된다.)
*/
public class User {
    // step2) 이 부분도 같이 변경해 줘야 한다.
    //          ex) (NewProvider p)
    public void methodUser(Provider p) {
        p.methodProvider();
    }
}

// step1) 제공자의 내용을 수정하거나 같은 기능을 하는 다른 제공자를 추가할 경우...
//          ex) NewProvider 추가
class Provider {
    public void methodProvider() {
        System.out.println("methodProvider()~~");
    }
}
class NewProvider {
    public void methodProvider() {
        System.out.println("methodNewProvider()~~");
    }
}