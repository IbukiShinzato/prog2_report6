package jp.ac.uryukyu.ie.e235718;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hands;

    Player(String name) {
        this.name = name;
        this.hands = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getHands() {
        return this.hands;
    }

    public ArrayList<String> showHands() {
        ArrayList<String> showHand = new ArrayList<>();
        for (Card card : this.hands) {
            showHand.add(card.showCard());
        }
        return showHand;
    }

}
