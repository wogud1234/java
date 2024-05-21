package _02_예외.ch03_리소스자동닫기.ex01;

public class Main {
    public static void main(String[] args) {

        try(MyResource res = new MyResource("A")) {
            String data = res.read01();
            int value = Integer.parseInt(data);
        } catch(Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println();

        try(MyResource res = new MyResource("B")) {
            String data = res.read02();
            int value = Integer.parseInt(data);
        } catch(Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }

        System.out.println();

        MyResource res1 = new MyResource("C");
        MyResource res2 = new MyResource("D");
        try(res1; res2) {
            String data1 = res1.read01();
            String data2 = res2.read02();
        } catch(Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}
