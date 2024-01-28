package jp.ac.uryukyu.ie.e235718;

import java.util.ArrayList;

public class Deck {
    private String[] marks;
    private ArrayList<Card> yamahuda;

    Deck() {
        this.marks = new String[4];
        marks[0] = "\u2660";
        marks[1] = "\u2663";
        marks[2] = "\u2665";
        marks[3] = "\u2666";
        this.yamahuda = new ArrayList<>();
    }

    public ArrayList<Card> createDeck() {
        for (String mark : marks) {
            for (int i = 1; i < 14; i ++ ) {
                this.yamahuda.add(new Card(mark, i));
            }
        }
        return this.yamahuda;
    }
}
