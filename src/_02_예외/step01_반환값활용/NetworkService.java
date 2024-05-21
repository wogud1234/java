package _02_예외.step01_반환값활용;

public class NetworkService {

    public void sendMessage(String data) {

        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if(isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        client.disconnect();
    }
    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}

/*
    - 정상 흐름과 예외 흐름이 섞여 있기 때문에 코드를 한눈에 이해하기 어렵다.
      쉽게 이야기해서 가장 중요한 정상 흐름이 한눈에 들어오지 않는다.
      심지어 예외 흐름이 더 많은 코드 분량을 차지한다. 실무에서는 예외 처리가 훨씬 더 복잡하다.

    - 지금과 같이 반환 값을 사용해서 예외 상황을 처리하는 방식으로는 정상 흐름과 예외 흐름을 분리할 수 없다.
      이런 문제를 해결하기 위해 예외 처리 메커니즘이 존재한다.
      예외 처리를 사용하면 정상 흐름과 예외 흐름을 명확하게 분리할 수 있다.
*/