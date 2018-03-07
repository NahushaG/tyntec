package com.app.utils;

import com.app.model.Moves;

import java.util.Random;

/**
 * Created by nahus on 07-03-2018.
 */
public class CustomUtil {
    /**
     * to generate random moves
     *
     * @return
     */
    public static Moves getRandomMoves(){
        int max=3;
        int min=1;
        Random random = new Random();
        Moves playerMoves=null ;
        int val= random.nextInt(max-min+1)+min; //Random number between 1,2,3
        for(Moves selectedMov:Moves.values()){
            if(selectedMov.getMoveValue()==val){
                playerMoves= selectedMov;   //Based on the random number move is selected
            }
        }
        return playerMoves;
    }
}
