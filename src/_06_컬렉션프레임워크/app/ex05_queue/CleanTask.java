package _06_컬렉션프레임워크.app.ex05_queue;

public class CleanTask implements Task {
    @Override
    public void execute() {
        System.out.println("사용하지 않는 자원 정리...");
    }
}
