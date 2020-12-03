/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPS;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Innocent Akash
 */
public class RPSCode {

    public static String Computer_Move() {
       ArrayList<String> P = new ArrayList<>();
       P = Play();
       return getRandomItem(P);

    }

    public static int getRandomChestItem(ArrayList<Integer> list) {
        return list.get(new Random().nextInt(list.size()));

    }
    public static String getRandomItem(ArrayList<String> list) {
        return list.get(new Random().nextInt(list.size()));

    }
    public static ArrayList<String> game(String call) {
        ArrayList<Integer> d;
        d = Model.Dice();
        ArrayList<String> s1 = new ArrayList<>();
        int i;
        for (i = 0; i <= getRandomChestItem(d); i++) {
            s1.add(call);

        }

        return s1;
    }

    public static ArrayList<String> Play() {
        ArrayList<String> Play = new ArrayList<>();
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        ArrayList<String> s3 = new ArrayList<>();
        s1 = game("R");
        s2 = game("P");
        s3 = game("S");
        Play.addAll(s3);
        Play.addAll(s1);
        Play.addAll(s2);
        return Play;
    }
    
    
    public static int RPS(String Player){
       String Computer = Computer_Move();
       if("R".equals(Computer)&&"S".equals(Player) )
       {
       return 0;
       }
       
       if("S".equals(Computer)&&"P".equals(Player) )
       {
       return 0;
       }
       if("P".equals(Computer)&&"R".equals(Player) )
       {
       return 0;
       }
       if("R".equals(Player)&&"S".equals(Computer) )
       {
       return 1;
       }
       
       if("S".equals(Player)&&"P".equals(Computer) )
       {
       return 1;
       }
       if("P".equals(Player)&&"R".equals(Computer) )
       {
       return 1;
       }
       
       
    
    
    
    
    return 2;
    }

}
