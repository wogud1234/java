package _02_예외.step03_unchecked예외처리.exceptions;

public class ConnectException extends RuntimeException {

    private final String address;

    public ConnectException(String message, String address) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
