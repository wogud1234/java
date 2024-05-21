package _02_예외.ch04_사용자정의예외.ex01;

class InsufficientException extends Exception {

    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message);
    }
}
