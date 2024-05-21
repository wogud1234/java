package _02_예외.ch02_예외떠넘기기;

public class ex01_throws_떠넘기기 {
    public static void main(String[] args) {

        try {
            findClass();
        } catch(ClassNotFoundException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
