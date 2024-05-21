package _02_예외.step03_unchecked예외처리;

public class NetworkService {

    public void sendMessage(String data) {

        String address = "https://example.com";

        NetworkClient client = new NetworkClient(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}

/*
    - 해당 오류를 잡아도 복구할 수 없는 경우는 catch로 잡아서 처리하지 않고, 밖으로 던진다.
      이때, 언체크 예외면 throws를 안 써도 되서 깔끔하다. 해결할 수 없는 예외들은 다른 곳에서 공통으로 처리된다.
      이런 방식 덕분에 서비스에서는 해결할 수 없는 예외 보다는 본인 스스로의 코드에 더 집중할 수 있다.
*/