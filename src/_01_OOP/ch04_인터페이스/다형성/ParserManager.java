package _01_OOP.ch04_인터페이스.다형성;

public class ParserManager {
    public static Parseable getParser(String type) {
        if(type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLParser();
        }
    }
}
