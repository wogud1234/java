package _01_OOP.ch03_클래스.내부클래스.ex03_외부에서생성;

public class Main {
    public static void main(String[] args) {

        // (1) 인스턴스 내부 클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야 된다.
        Outter oc = new Outter();
        Outter.InstanceInner ii = oc.new InstanceInner();
        System.out.println("ii.iv : " + ii.iv);

        System.out.println("Outer2.StaticInner.cv : " + Outter.StaticInner.cv);

        // (2) 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
        Outter.StaticInner si = new Outter.StaticInner();
        System.out.println("si.iv : " + si.iv);
    }
}
/*
 	- 컴파일 했을 때 생성되는 파일명은 '외부 클래스명&내부 클래스명.class' 형식으로 된다.
 	  지역내부 클래스는 다른 메서드에 같은 이름의 내부 클래스가 존재할 수 있기 때문에 내부 클래스명 앞에 숫자가 붙는다.
 	  	ex) Outer$InstanceInner.class
 	  	ex) Outer$1LocalInner.class
*/