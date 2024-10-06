// Team.java
import java.util.ArrayList;

public class Team {
    private String name;
    private int rank;
    private ArrayList<String> players;
    
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void addPlayer(String playerName) {
        this.players.add(playerName);
    }
    
    public String toString() {
        String result = "Hold: " + this.name + " Rang: " + this.rank + "\n";
        result += "Spillere:\n";
        for (String player : players) {
            result += player + "\n";
        }
        return result;
    }
}