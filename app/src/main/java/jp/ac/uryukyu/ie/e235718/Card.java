package jp.ac.uryukyu.ie.e235718;

public class Card {
    private String type;
    private int number;

    Card(String type, int number) {
        setType(type);
        setNumber(number);
    }

    public String getName() {
        return this.type;
    }

    public int getNumber() {
        return this.number;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String showCard() {
        if (this.type.equals("Joker")) {
            return this.type;
        } else if (this.number == 11) {
            return this.type + "J";
        } else if (this.number == 12) {
            return this.type + "Q";
        } else if (this.number == 13) {
            return this.type + "K";
        } else {
            return this.type + this.number;
        }
    }
}
