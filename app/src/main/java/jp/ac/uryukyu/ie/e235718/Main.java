package jp.ac.uryukyu.ie.e235718;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Joker", 0);
        System.out.println(card.showCard());
        Deck yamahuda = new Deck();
        System.out.println(yamahuda.createDeck().size());
    }
}

