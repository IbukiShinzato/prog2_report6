package jp.ac.uryukyu.ie.e235718;

public class Main {
    public static void main(String[] args) {
        // Card testCard1 = new Card("H 13");
        // System.out.printf("カードのタイプは%sです。\n",testCard1.getType());
        // System.out.printf("カードのナンバーは%dです。\n", testCard1.getNumber());

        // Card testCard2 = new Card("joker");
        // System.out.printf("カードのタイプは%sです。\n",testCard2.getType());
        // System.out.printf("カードのナンバーは%dです。\n", testCard2.getNumber());

        // Player testPlayer = new Player("");
        // testPlayer.getName();
        // testPlayer.setName("");
        // testPlayer.setName("レナトス・リボル");
        // testPlayer.getName();
        // Card card = new Card("H 13");
        // testPlayer.addCard(card);
        // System.out.println(testPlayer.showCard());
        // testPlayer.sayName();

        Gamemaster test = new Gamemaster(null, null);
        test.getPlayers();
        test.dealOut();
        for (Player player : test.players) {
            // player.showHands();
            System.out.println(player.hands.size());
        }
    }
}

