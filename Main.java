package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static final int EXTRA_RUNS = 16;
    public static final int MATCH_ID = 0;
    public static final int BOWLING_TEAM = 3;
    public static final int TOTAL_RUNS = 17;
    public static final int BOWLER = 8;
    public static final int SEASON = 1;
    public static final int WINNER = 10;
    public static final int TOSS_WINNER = 7;
    public static final int ID = 0;
    public static final int PLAYER_OF_MATCH = 13;


    public static void main(String[] args){
    List<Match> match = new ArrayList<>();
    List<Delivery> delivery = new ArrayList<>();
    Scenarios scene = new Scenarios();

    try {
        FileReader fileReader1 = new FileReader("/home/kishore/Downloads/archive/deliveries.csv");
        BufferedReader Reader1 = new BufferedReader(fileReader1 );
        String line = "";
        while ((line = Reader1.readLine()) != null) {
            String[] deliverydata = line.split(",");
            Delivery deliver = new Delivery();
            deliver.setExtra_runs(deliverydata[EXTRA_RUNS]);
            deliver.setMatch_id(deliverydata[MATCH_ID]);

            deliver.setBowling_team(deliverydata[BOWLING_TEAM]);
            deliver.setTotal_runs(deliverydata[TOTAL_RUNS]);
            deliver.setBowler(deliverydata[BOWLER]);
            delivery.add(deliver);
        }
    } catch (Exception e) {
      e.printStackTrace();
    }
    try {
        FileReader fileReader2 = new FileReader("/home/kishore/Downloads/archive/matches.csv");
        BufferedReader  reader2= new BufferedReader(fileReader2);
        String line = "";
        while ((line = reader2.readLine()) != null) {
            String[] matchdata = line.split(",");
            Match matches = new Match();
            matches.setSeason(matchdata[SEASON]);
            matches.setWinner(matchdata[WINNER]);
            matches.setToss_winner(matchdata[TOSS_WINNER]);
            matches.setId(matchdata[ID]);
            matches.setPlayer_of_match(matchdata[PLAYER_OF_MATCH]);
            match.add(matches);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }






System.out.println(scene.resultOfExtraRunsConcededPerTeamIn2016(match,delivery));
System.out.println(scene.resultOfEconomicalBowlerIn2015(match,delivery));
System.out.println(scene.resultofMatchesWonAllteamsOverAllYearOfIpl(match));
System.out.println(scene.resultOfTotalMatchesPlayedPerYear(match));
System.out.println(scene.resultOfPlayerOfTheMatch(match));
    }

}
