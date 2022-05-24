package project;

public class Match {
    private String winner;
    private String id;
    private String season;
    private String toss_winner;
    private String player_of_match;


    public String getPlayer_of_match() {
        return player_of_match;
    }
    public void setPlayer_of_match(String player_of_match) {
        this.player_of_match = player_of_match;
    }
    public void setToss_winner(String toss_winner) {
        this.toss_winner = toss_winner;
    }
    public String getToss_winner() {
        return toss_winner;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }


}
