package jp.ac.uryukyu.ie.e235718;

import java.util.Scanner;
import java.util.ArrayList;

public class GameMaster {
    private Scanner scanner;
    int playerCount;
    private Player[] players;

    GameMaster() {
        System.out.printf("\nゲーム開始！\n");
        this.scanner = new Scanner(System.in);
        System.out.printf("\nプレイヤーの人数を選択してください。\n例：4\n");
        playerCount = this.scanner.nextInt();
        
        try {
            int loop = (52 - (52 % playerCount)) / playerCount;
        } catch (Exception e) {
            System.err.println("正しい数字を入力してください。");
        }

        this.players = new Player[playerCount];
        for (int i = 1; i < playerCount + 1; i ++ ) {
            System.out.printf("\n名前を入力してください。\n");
            String name = this.scanner.next();
            this.players[i] = new Player(name);
        }
    }
}
