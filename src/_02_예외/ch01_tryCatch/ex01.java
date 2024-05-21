package _02_예외.ch01_tryCatch;

public class ex01 {
    public static void main(String[] args) {

        System.out.println("[프로그램 시작]\n");
        printLength("안녕??");

        printLength(null);
        System.out.println("[프로그램 종료]");
    }

    public static void printLength(String data) {

        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch(NullPointerException e) {
            System.out.println("===========================================================================");
            System.out.print("1) ");    System.out.println(e.getMessage());
            System.out.print("2) ");    System.out.println(e.toString());
            e.printStackTrace();
            System.out.println("===========================================================================");
        } finally {
            System.out.println("<마무리 실행>\n");
        }
    }
}
