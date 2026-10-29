
package iplproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayersDao {

 
    public List<Player> getAllPlayers() {

        List<Player> playerList = new ArrayList<>();

        String query = "SELECT * FROM players";

        try (Connection con = MyDbConfig.getSQLDbConnection()) {

            if (con == null) {
                System.out.println(
                    "Database connection failed!"
                );
                return playerList;
            }

            try (PreparedStatement ps =
                     con.prepareStatement(query);
                 ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {

                    Player p = new Player(
                        rs.getInt("playerId"),
                        rs.getString("playerName"),
                        rs.getString("teamName"),
                        rs.getString("category")
                    );

                    playerList.add(p);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return playerList;
    }

   
    public boolean addPlayer(Player player) {

        String query =
            "INSERT INTO players " +
            "(playerId, playerName, teamName, category) " +
            "VALUES (?, ?, ?, ?)";

        try (Connection con = MyDbConfig.getSQLDbConnection()) {

            if (con == null) {
                System.out.println(
                    "Database connection failed!"
                );
                return false;
            }

            try (PreparedStatement ps =
                     con.prepareStatement(query)) {

                ps.setInt(1, player.getPlayerId());
                ps.setString(2, player.getPlayerName());
                ps.setString(3, player.getTeamName());
                ps.setString(4, player.getCategory());

                return ps.executeUpdate() > 0;
            }

        } catch (SQLException e) {
            System.out.println(
                "Database error: " + e.getMessage()
            );
            return false;
        }
    }
}

