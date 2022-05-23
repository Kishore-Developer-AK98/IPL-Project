package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Iplscenario1 {
   static ArrayList<String>list1;

   public static void matchwon(){
       HashMap<String,Integer>winner =new HashMap<>();
       for(String s:list1){
           if(winner.containsKey(s)){
               int count = winner.get(s);
               winner.put(s,count+1);
           }else{
               winner.put(s,1);
           }
       }
       System.out.print(winner);
    }

    public static void main(String[] args) {
        list1 =new ArrayList<>();
        int pass =0;


        //----------------------------------------------------------------------------------------------//
        String csvFile = "/home/kishore/Downloads/archive/matches.csv";
        BufferedReader br = null;
        String line = "";
        String commaSplitter = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                if (pass==0){
                    pass++;
                    continue;
                }

                String[] delivery = line.split(commaSplitter);
                list1.add(delivery[10]);

            }




          } catch (Exception e) {e.printStackTrace();}
        matchwon();
    }

}
