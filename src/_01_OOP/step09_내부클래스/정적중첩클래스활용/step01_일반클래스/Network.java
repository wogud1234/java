package _01_OOP.step09_내부클래스.정적중첩클래스활용.step01_일반클래스;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage nm = new NetworkMessage(text);
        nm.print();
    }
}

class NetworkMessage {

    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}

/*
    - Network 관련 라이브러리를 사용하기 위해서 패키지를 열어본 개발자는 아마도 두 클래스를 모두 확인해볼 것이다.
      그리고 해당 패키지를 처음 확인한 개발자는 Network와 NetworkMessage를 둘 다 사용해야 하나?? 또는
      NetworkMessage에 메시지를 담아서 Network에 전달해야 하나?? 와 같은 여러가지 생각을 할 것이다.
      아니면 NetworkMessage가 다른 여러 클래스에서 사용되겠구나 라고 생각할 수도 있다.
      두 클래스의 코드를 꼼꼼히 확인하고 나서야 NetworMessage는 단순히 Network 안에서만 사용되고 있으므로,
      나는 Network만 사용하면 되는구나 라고 이해하게된다.
*/