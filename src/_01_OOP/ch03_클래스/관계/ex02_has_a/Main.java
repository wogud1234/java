package _01_OOP.ch03_클래스.관계.ex02_has_a;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();

        Card c = deck.pick(0);
        System.out.println(c);

        deck.shuffle();
        c = deck.pick(0);
        System.out.println(c);
        
        c = deck.pick();
        System.out.println(c);
    }
}
