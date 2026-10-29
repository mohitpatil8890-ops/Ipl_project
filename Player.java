package iplproject;

public class Player {
	

	

	    private int playerId;
	    private String playerName;
	    private String teamName;
	    private String category;

	    public Player(int playerId, String playerName,
	                  String teamName, String category) {
	        this.playerId = playerId;
	        this.playerName = playerName;
	        this.teamName = teamName;
	        this.category = category;
	    }

	    public int getPlayerId() {
	        return playerId;
	    }

	    public String getPlayerName() {
	        return playerName;
	    }

	    public String getTeamName() {
	        return teamName;
	    }

	    public String getCategory() {
	        return category;
	    }

	    @Override
	    public String toString() {
	        return "Player ID: " + playerId
	                + " | Name: " + playerName
	                + " | Team: " + teamName
	                + " | Category: " + category;
	    }
	}



