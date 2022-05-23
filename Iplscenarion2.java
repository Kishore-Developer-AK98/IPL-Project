package project;

import java.io.BufferedReader;
import java.lang.*;
import java.io.FileReader;
import java.util.ArrayList;

public class Iplscenarion2 {
    static ArrayList<String[]> show;

    public static void main(String[] args){

        int pass =0;
        String[] value = new String[0];

        String csvFile = "/home/kishore/Downloads/archive/deliveries.csv";

        String space ="";
        BufferedReader br =null;

        try {
            br = new BufferedReader(new FileReader((csvFile)));
            while((space=br.readLine()) !=null){
                if (pass == 0){
                    pass++;
                    continue;
                }
                String[] arr = space.split(",");

                 show =new ArrayList<>();
               for(int i=0;i <arr.length;i++){
                 if(i==577){
                     show.add(arr);

                 }
               }
            }
        } catch (Exception e) {e.printStackTrace();}
        System.out.println(show);
    }
}
