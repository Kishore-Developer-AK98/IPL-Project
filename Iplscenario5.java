package project;
import java.io.*;

import java.util.*;


public class Iplscenario5{
    static List<String> list2;
    static ArrayList<String> list;
    public static void manofthematches(){
        HashMap<String,Integer> matchcount= new HashMap<>();
        for (String s:list2){
            if(matchcount.containsKey(s)){
                int value = matchcount.get(s);
                matchcount.put(s,value+1);
            }else{
                matchcount.put(s,1);
            }
        }
        System.out.println(matchcount); //man of the matches achieved by the players in number of times
    }



    public static void main(String[] args) {

        list2 = new ArrayList<>();
        String path = "/home/kishore/Downloads/archive/matches.csv";

        String line = "";
        int pass = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                if(pass ==0){
                    pass++;
                    continue;
                }
                String[] values = line.split(",");
                list2.add(values[13]);
            }

        } catch(Exception e){
            e.printStackTrace();

        }
        manofthematches();

    }
}
