package _01_OOP.ch04_인터페이스.다형성;

public class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + " - XML parsing completed.");
    }
}
class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + " - HTML parsing completed.");
    }
}
