package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scenarios {
    public static Map<String, Integer> resultOfTotalMatchesPlayedPerYear(List<Match> matches) {
        Map<String, Integer> everyYear = new HashMap<>();
        matches.remove(0);

        System.out.println("----------------------------------------------------------");
        System.out.println("Number of matches played per year of all the years in IPL :");
        for (Match match : matches) {
            if (everyYear.containsKey(match.getSeason())) {
                int count = everyYear.get(match.getSeason());
                everyYear.replace(match.getSeason(), count + 1);
            } else {
                everyYear.put(match.getSeason(), 1);
            }

        }
        return everyYear;
    }
    public static Map<String, Integer> resultofMatchesWonAllteamsOverAllYearOfIpl(List<Match> matches) {
        Map<String, Integer> allMatch = new HashMap<>();

        System.out.println("----------------------------------------------------------");
        System.out.println("Number of matches won of all teams over all the years of IPL :");
        for (Match match : matches) {
            if (allMatch.containsKey(match.getWinner())) {
                int count = allMatch.get(match.getWinner());
                allMatch.replace(match.getWinner(), count + 1);
            }
            else {
                allMatch.put(match.getWinner(), 1);
            }
        }
        return allMatch;
    }

    public static Map<String, Integer> resultOfExtraRunsConcededPerTeamIn2016(List<Match> matches, List<Delivery> delivery) {
          Map<String, Integer> extraRunsByTeam = new HashMap<>();
          List<String> sameID = new ArrayList<>();

        System.out.println("----------------------------------------------------------");
        System.out.println("For the year 2016 get the Extra Runs conceded per team :");
        for (Match match : matches) {
            if (match.getSeason().equals("2016")) {
                sameID.add(match.getId());
            }
        }
        for (Delivery deliveryobj : delivery) {
            if (sameID.contains(deliveryobj.getMatch_id())) {
                if (extraRunsByTeam.containsKey(deliveryobj.getBowling_team()) && !deliveryobj.getBowling_team().equals("0")) {
                    int count = extraRunsByTeam.get(deliveryobj.getBowling_team()) + Integer.parseInt(deliveryobj.getExtra_runs());
                    extraRunsByTeam.replace(deliveryobj.getBowling_team(), count);
                }
                else if (!extraRunsByTeam.containsKey(deliveryobj.getBowling_team()) && !deliveryobj.getBowling_team().equals("0")) {
                    extraRunsByTeam.put(deliveryobj.getBowling_team(), Integer.parseInt(deliveryobj.getExtra_runs()));
                }
            }
        }

        return extraRunsByTeam;
    }

    public static Map<String, Float> resultOfEconomicalBowlerIn2015(List<Match> matches, List<Delivery> delivery) {
        Map<String, Integer> bowlerBall = new HashMap<>();
        Map<String, Integer> bowlerRuns = new HashMap<>();
        List<String> similarID = new ArrayList<>();


        System.out.println("----------------------------------------------------------");
        System.out.println("For the year 2015 get the top economical bowlers :");
        for (Match match : matches) {
            if (match.getSeason().equals("2015")) {
                similarID.add(match.getId());
            }
        }
        for (Delivery deliveryobj : delivery) {
            if (similarID.contains(deliveryobj.getMatch_id())) {
                int totalRuns = Integer.parseInt(deliveryobj.getTotal_runs());
                if (bowlerRuns.containsKey(deliveryobj.getBowler())) {
                    int count = bowlerRuns.get(deliveryobj.getBowler());
                    bowlerRuns.replace(deliveryobj.getBowler(), count + totalRuns);
                } else {
                    bowlerRuns.put(deliveryobj.getBowler(), totalRuns);
                }}}
                    for (Delivery deliveryobj : delivery) {
                        if (similarID.contains(deliveryobj.getMatch_id())) {
                            if (bowlerBall.containsKey(deliveryobj.getBowler())) {
                                int count = bowlerBall.get(deliveryobj.getBowler());
                                bowlerBall.replace(deliveryobj.getBowler(), count + 1);
                            } else {
                                bowlerBall.put(deliveryobj.getBowler(), 1);
                            }
                        }
                    }
                    HashMap<String, Float> economy = new HashMap<>();
                    for (String s : bowlerBall.keySet()) {
                        economy.put(s, (float) bowlerRuns.get(s) / (bowlerBall.get(s) / 6));
                    }
                    return economy;
                }
    public static Map<String, Integer> resultOfPlayerOfTheMatch(List<Match> matches) {
        Map<String, Integer> manofthematch = new HashMap<>();

        System.out.println("----------------------------------------------------------");
        System.out.println("Player of the Match achieved per year of all the years in IPL :");
        for (Match match : matches) {
            if (manofthematch.containsKey(match.getPlayer_of_match())) {
                int count = manofthematch.get(match.getPlayer_of_match());
                manofthematch.replace(match.getPlayer_of_match(), count + 1);
            } else {
                manofthematch.put(match.getPlayer_of_match(), 1);
            }
        }
        return manofthematch;
    }
}
