package project;


public class Delivery {
    private String total_runs;
    private String bowling_team;
    private String match_id;
    private String extra_runs;


    public String getExtra_runs() {
        return extra_runs;
    }
    public void setExtra_runs(String extra_runs) {
        this.extra_runs = extra_runs;
    }
    public String getMatch_id() {
        return match_id;
    }
    public void setMatch_id(String match_id) {
        this.match_id = match_id;
    }
    public String getBowler() {
        return bowler;
    }
    public void setBowler(String bowler) {
        this.bowler = bowler;
    }
    private String bowler;
    public String getTotal_runs() {
        return total_runs;
    }
    public void setTotal_runs(String total_runs) {
        this.total_runs = total_runs;
    }
    public String getBowling_team() {
        return bowling_team;
    }
    public void setBowling_team(String bowling_team) {
        this.bowling_team = bowling_team;
    }
    
}
