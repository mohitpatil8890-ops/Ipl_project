
package iplproject;

import java.util.List;

public class Iplmain {

    public static void main(String[] args) {

        System.out.println("Welcome to IPL.com");

        PlayerOperation playersOps = new PlayerOperation();

        System.out.println("\n1. Get All Players of All Teams");

        List<Player> allPlayersList = playersOps.getAllPlayers();
        allPlayersList.forEach(System.out::println);

        System.out.println("\n2. Get All Players of RCB");

        List<Player> rcbPlayers =
                playersOps.getAllPlayersGivenTeamName("RCB");
        rcbPlayers.forEach(System.out::println);

        System.out.println("\n3. Get All Batsmen");

        List<Player> allBatters =
                playersOps.getAllPlayersBycategory("Batsman");
        allBatters.forEach(System.out::println);

        System.out.println("\n4. Get All Bowlers");

        List<Player> allBowlers =
                playersOps.getAllPlayersBycategory("Bowler");
        allBowlers.forEach(System.out::println);

        System.out.println("\n5. Get All All-Rounders");

        List<Player> allRounders =
                playersOps.getAllPlayersBycategory("All-Rounder");
        allRounders.forEach(System.out::println);
    }
}
