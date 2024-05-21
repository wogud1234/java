package _01_OOP.step09_내부클래스.정적중첩클래스활용.step02_정적중첩클래스;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage nm = new NetworkMessage(text);
        nm.print();
    }

    private static class NetworkMessage {

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}

/*
    - step01과는 달리 패키지를 열어보면 Network 하나의 클래스가 보일 것이다.
      Network 관련 라이브러리를 사용하기 위해 패키지를 열어본 개발자는 해당 클래스만 확인할 것이다.
      추가로 NetworkMessage가 중첩 클래스에 private 접근 제어자로 되어 있는 것을 보고,
      Network 내부에서만 단독으로 사용하는 클래스라고 바로 인지할 수 있다.
*/
