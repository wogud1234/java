package _02_예외.ch01_tryCatch;

public class ex04 {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(3/0);
            System.out.println(4);
        } catch(ArithmeticException ae) {	// 예외가 발생하면, 발생한 예외에 해당하는 클래스의 인스턴스가 만들어 진다.
            if(ae instanceof ArithmeticException)
                System.out.println(true);
            System.out.println("ArithmeticException");
        } catch(Exception e) {
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
