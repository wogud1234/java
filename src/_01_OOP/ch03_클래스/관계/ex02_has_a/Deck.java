package _01_OOP.ch03_클래스.관계.ex02_has_a;

public class Deck {

    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];

    Deck() {
        int idx = 0;
        for(int i=0 ; i<Card.KIND_MAX ; i++)
            for(int j=0; j<Card.NUM_MAX ; j++)
                cardArr[idx++] = new Card(i+1, j+1);
    }
    Card pick(int idx) {
        return cardArr[idx];
    }
    Card pick() {
        int idx = (int)(Math.random() * CARD_NUM);
        return pick(idx);
    }
    void shuffle() {
        for(int i=0 ; i<cardArr.length ; i++) {
            int r = (int)(Math.random()*CARD_NUM);
            Card temp  = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}
