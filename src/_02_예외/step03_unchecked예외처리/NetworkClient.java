package _02_예외.step03_unchecked예외처리;

import _02_예외.step03_unchecked예외처리.exceptions.ConnectException;
import _02_예외.step03_unchecked예외처리.exceptions.SendException;

public class NetworkClient {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClient(String address) {
        this.address = address;
    }

    public void connect() {
        if(connectError)
            throw new ConnectException(address, address + " 서버 연결 실패");

        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendException(data, address + " 서버에 데이터 전송 실패: " + data);
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}

/*
    - unchecked 예외는 throws 안 해주면 자동으로 throw 한다.
*/