package _03_유틸.java_lang.Object클래스.getClass;

public class Card {

    private String kind;
    private int number;

    public Card() {
        this("SPADE", 1);
    }

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                '}';
    }
}
