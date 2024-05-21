package _02_예외.ch03_리소스자동닫기.ex01;

public class MyResource implements AutoCloseable {

    private String name;

    public MyResource(String name) {
        this.name = name;
    }

    public String read01() {
        System.out.println("[MyResource(" + name + ") 읽기01]");
        return "100";
    }
    public String read02() {
        System.out.println("[MyResource(" + name + ") 읽기02]");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("[MyResource(" + name + ") 닫기]");
    }
}
