package _02_예외.step02_checked예외처리;

public class NetworkClient {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClient(String address) {
        this.address = address;
    }

    public void connect() throws ConnectException {
        if(connectError) {
            // throw new NetworkClientException("connectError", address + " 서버 연결 실패");
            throw new ConnectException(address, address + " 서버 연결 실패");
        }

        System.out.println(address + "서버 연결 성공");
    }

    public void send(String data) throws SendException {
        if(sendError) {
            // throw new NetworkClientException("sendError", address + " 서버에 데이터 전송 실패: " + data);
            throw new SendException(data, address + " 서버에 데이터 전송 실패");
        }

        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1"))
            connectError = true;
        if(data.contains("error2"))
            sendError = true;
    }
}

/*
    - 기존의 코드와 대부분 같지만, 오류가 발생했을 때 오류 코드를 반환하는 것이 아니라 예외를 던진다.
      따라서 반환 값을 사용하지 않아도 된다. 여기서는 반환 값을 void 로 처리한다.
      이전에는 반환 값으로 성공, 실패 여부를 확인해야 했지만,
      예외 처리 덕분에 메서드가 정상 종료되면 성공이고, 예외가 던져지면 예외를 통해 실패를 확인할 수 있다.
      오류가 발생하면, 예외 객체를 만들고 거기에 오류 코드와 오류 메시지를 담아둔다.
      그리고 만든 예외 객체를 throw 를 통해 던진다.
*/