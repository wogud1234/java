package _02_예외.step02_checked예외처리;

public class NetworkService {

    public void sendMessage(String data) {

        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectException e) {
            System.out.println("[연결 오류]: 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendException e) {
            System.out.println("[전송 오류]: 전송 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientException e) {
            System.out.println("[네트워크 오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}

/*
    - 예외 처리 메커니즘은 try-catch 구조를 사용해서, 정상 흐름은 try 블럭에 모아놓고,
      예외 흐름은 catch 블럭에 별도로 모아놓음으로써 정상 흐름과 예외 흐름이 명확하게 분리되어
      코드를 더 쉽게 읽을 수 있게 한다.

    - 에외 클래스를 세분화해서 각각의 예외 상황에 맞추어 만들면, 각 필요에 맞는 예외를 잡아서 처리할 수 있다.
      예를 들면 e.getAddress(), e.getSendData()와 같이 각각의 예외 클래스가 가지는 고유의 기능을 활용할 수 있다.
*/