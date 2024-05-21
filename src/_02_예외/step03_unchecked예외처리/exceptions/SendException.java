package _02_예외.step03_unchecked예외처리.exceptions;

public class SendException extends RuntimeException {

    private final String sendData;

    public SendException(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
