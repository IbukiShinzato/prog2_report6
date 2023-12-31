package jp.ac.uryukyu.ie.e235718;
import java.util.ArrayList;

public class Player {
    private String name;
    public ArrayList<Card> hands;

    Player(String name){
        // List<String> names1 = new ArrayList<String>("空条承太郎", "東方仗助", "吉良吉影", "DIO", "岸辺露伴", "リサリサ", "イギー");
        this.name = name;
        hands = new ArrayList<Card>();
    }


    public void addCard(Card card) {
        hands.add(card);
    }

    // void sayName(){
    //     int p = 1;
    //     ArrayList<Integer> nums = new ArrayList<Integer>();
    //     while(true) {
    //         Random rand = new Random();
    //         int num = rand.nextInt(8);
    //         if (nums.contains(num)){
    //             continue;
    //         } else {
    //             System.out.printf("プレイヤー%dの名前は%sです。\n",p ,names.get(num));
    //             p += 1;
    //             nums.add(num);
    //             if (p == 4) {
    //                 break;
    //             }
    //         }
    //     }
    // }

    public void showHands() {
        for (Card card : this.hands) {
            System.out.println(card.getType());
            System.out.println(card.getNumber());
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public void setName(String name){
    //     if (name.length() == 0){
    //         System.out.println("名前を入力してください。");
    //     }else{
    //         this.name.add(name);
    //     }
    // }

    public int showCard() {
        // if(judge()) {
            return this.hands.get(0).getNumber();
        // }
    }
}
