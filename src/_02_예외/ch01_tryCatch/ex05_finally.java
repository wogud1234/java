package _02_예외.ch01_tryCatch;

public class ex05_finally {
    public static void main(String[] args) {

        method();
        System.out.println("method()의 수행을 마치고 main()으로 돌아왔습니다.");
    }

    static void method() {
        try {
            System.out.println("method()이 호출되었습니다.");
            return;	// <- return문을 만나도 finally블럭의 문장들은 수행된다!!!
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method()의 finally블럭이 실행되었습니다.");
        }
    }
}
