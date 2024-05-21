package _02_예외.step02_checked예외처리;

public class NetworkClientException extends Exception {

    private String errorCode;

    public NetworkClientException(String message) {
        super(message);
    }

    public NetworkClientException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}

/*
    - step01 에서는 오류 코드(errorCode)를 반환 값으로 리턴해서, 어떤 오류가 발생힜는지 구분했는데,
      여기서는 어떤 종류의 오류가 발생했는지 구분하기 위해 예외 안에 오류 코드를 보관한다.

    - 오류 메세지(message)에는 어떤 오류가 발생했는지 개발자가 보고 이해할 수 있는 설명을 담아둔다.
      오류 메시지는 상위 클래스인 Throwable에서 기본으로 제공하는 기능을 사용한다.
*/

class ConnectException extends NetworkClientException {

    private final String address;

    public ConnectException(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

class SendException extends NetworkClientException {

    private final String sendData;

    public SendException(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}