package _02_예외.step03_unchecked예외처리.exceptions;

public class NetworkClientException extends RuntimeException {

    public NetworkClientException(String message) {
        super(message);
    }
}
