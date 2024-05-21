package _01_OOP.ch04_인터페이스.다형성;

public class Main {
    public static void main(String[] args) {

        Parseable parser = ParserManager.getParser("XML");
        // 나중에 새로운 버전인 NewXMLPaser 클래스가 나와도 이 부분은 건드릴필요 없이 ParseManager만 변경해 주면 된다.
        //		return new XMLParser(); -> return new NewXMLParser();
        parser.parse("document1.xml");
        // 이러한 방식은 분산환경 프로그래밍에서 그 위력을 발휘한다.
        // 사용자 컴퓨터에 설치된 프로그램을 변경하지 않고,
        // 서버측의 변경만으로 사용자가 새로 개정된 프로그램을 사용하는 것이 가능하다.

        parser = ParserManager.getParser("HTML");	// 인터페이스의 다형성...
        parser.parse("document2.xml");
    }
}
