package _06_컬렉션프레임워크.app.ex05_queue;

public class BackupTask implements Task {

    @Override
    public void execute() {
        System.out.println("자료 백업...");
    }
}
