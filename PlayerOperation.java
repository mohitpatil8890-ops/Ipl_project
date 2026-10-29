
package iplproject;

import java.util.ArrayList;
import java.util.List;

public class PlayerOperation {

    private final PlayersDao playersDao = new PlayersDao();

   
    public List<Player> getAllPlayers() {
        return playersDao.getAllPlayers();
    }

 
    public List<Player> getAllPlayersGivenTeamName(String teamName) {

        List<Player> result = new ArrayList<>();

        for (Player p : getAllPlayers()) {
            if (p.getTeamName().equalsIgnoreCase(teamName)) {
                result.add(p);
            }
        }

        return result;
    }


    public List<Player> allBatters() {

        List<Player> result = new ArrayList<>();

        for (Player p : getAllPlayers()) {
            if (p.getCategory().equalsIgnoreCase("Batter")) {
                result.add(p);
            }
        }

        return result;
    }


    public List<Player> getAllPlayersBycategory(String category) {

        List<Player> result = new ArrayList<>();

        for (Player p : getAllPlayers()) {
            if (p.getCategory().equalsIgnoreCase(category)) {
                result.add(p);
            }
        }

        return result;
    }


    public boolean addPlayer(Player player) {
        return playersDao.addPlayer(player);
    }
}
