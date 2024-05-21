package _01_OOP.ch02_초기화블럭;

public class ex01 {

    static {
        System.out.println("static { } 실행\n");
    }

    {
        System.out.println("{ } 실행");
    }

    public ex01() {
        System.out.println("생성자 호출");
    }

    public static void main(String[] args) {

        System.out.println("초기화 블럭 테스트1");
        ex01 block1 = new ex01();

        System.out.println();

        System.out.println("초기화 블럭 테스트2");
        ex01 block2 = new ex01();

        // => 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한 번만 수행되었지만, 인스턴스 초기화 블럭은 인스턴스가 생성될 때 마다 수행 되었다.
    }
}
