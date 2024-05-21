package _01_OOP.ch03_클래스.상속.싱글톤;

/*
 	- 생성자가 private인 클래스는 다른 클래스의 조상이 될 수 없다.
 	  (자손 클래스의 인스턴스를 생성할 때 조상클래스의 생성자를 호출해야 하는데, 생성자의 접근 제어자가 private이므로 그것이 불가능 하기 때문...)
 	  그래서 클래스 앞에 final을 더 추가하여 상속할 수 없는 클래스라는 것을 알리는 것이 좋다.
*/

final class Singleton {

    private static Singleton s = null;

    private Singleton() {
        System.out.println("인스턴스 생성~~");
    }
    public static Singleton getInstance() {
        if(s==null)
            s = new Singleton();
        return s;
    }
}

