package com.mycompany.guiarel_2.entities;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Player> playerList;
    private Revolver revolver;

    public Game() {
        revolver = new Revolver();
        playerList = new ArrayList();
    }

    public void fillGame(List<Player> playerList, Revolver revolver) {
        this.playerList = playerList;
        this.revolver = revolver;
    }

    public List<Player> enterPlayers() {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");
        System.out.println("Enter the number of players (1-6):");
        int n = sc.nextInt();
        n = (n < 1 || n > 6) ? 6 : n;
        for (int i = 0; i < n; i++) {
            Player player = new Player();
            player.setId(i + 1);
            playerList.add(player);
        }
        return playerList;
    }

    public void round() {
        boolean flag=true;
        revolver.fillRevolver();
        fillGame(enterPlayers(), revolver);
        do {
            for (Player player : playerList) {
                if (player.shoot(revolver)) {
                    System.out.println(player.getName() + " got wet.\n The game END.");
                    flag=false;
                    break;
                } else {
                    System.out.println(player.getName() + " is safe and dry.");
                }
            }
        } while (flag);
    }
}
