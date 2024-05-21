package _02_예외.ch03_리소스자동닫기.ex02_억제된예외;

public class CloseableResource implements AutoCloseable {

    public void exceptionWork(boolean exception) throws WorkException {
        System.out.println("exceptionWork(" + exception + ")가 호출됨");
        if(exception)
            throw new WorkException("WorkException발생!!");
    }
    @Override
    public void close() throws Exception {
        System.out.println("close()가 호출됨.");
        throw new CloseException("CloseException발생!!!");
    }
}
class WorkException extends Exception {
    WorkException(String msg) {
        super(msg);
    }
}
class CloseException extends Exception {
    CloseException(String msg) {
        super(msg);
    }
}