package Finished;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TowerGame {
    public static void main(String[] args) {
    int n = 1; //number of towers
    int m = 7; //height of each tower
        int[] towers = new int[n];
        for(int i = 0; i<n; i++){ //make towers in one array
            towers[i] = m;
        }
        System.out.println(Arrays.toString(towers));
        System.out.println("Player " + (towerPlay(towers, n, m)+1) +" Wins");
    }

    public static int towerPlay(int[] towers, int n, int m){
        boolean play=true;
        int player=0;

        List<Integer> blockChoice = new ArrayList<>();
        for(int c = 2; c<=m; c++){
            if(m%c == 0){
                blockChoice.add(m/c);
            }
        }
        System.out.println(blockChoice + "blockChoice");
        while(play == true){
            //find the highest multiple to subtract
            Arrays.sort(towers); //select tallest tower and then subtract largest multiple
            nextPlay:
            for(int t=0; t<n;t++){ //towers iteration
                play = false;
                int height = towers[n-1-t];
                for(int h : blockChoice){ //height multiple iteration
                    if(h>0 && h < height){
                        System.out.println(Arrays.toString(towers)+ " - p"+ (player+1)+" remove "+ towers[n-1-t]/h+" from tower "+ (n-t));
                        towers[n-1-t] -= height/h;
                        player = (player + 1) % 2; //reverse between 1 and 0
                        play = true;
                        break nextPlay;
                    }
                }
            }
        }
        player = (player + 1) % 2;
        System.out.println(Arrays.toString(towers)+ " - p"+ (player+1)+" Won");
        return player;
    }
}

