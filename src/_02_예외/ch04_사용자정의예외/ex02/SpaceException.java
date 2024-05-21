package _02_예외.ch04_사용자정의예외.ex02;

public class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}
class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}