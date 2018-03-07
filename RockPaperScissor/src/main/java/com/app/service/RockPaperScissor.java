package com.app.service;

import com.app.model.Moves;
import com.app.utils.CustomUtil;

import java.util.Random;

/**
 * Created by nahusha on 07-03-2018.
 *
 */
public class RockPaperScissor {


    public static void main(String args[]) {
        RockPaperScissor rockPaperScissor = new RockPaperScissor();
        int totalRound = 100;
        rockPaperScissor.intiateGame(Moves.PAPER, totalRound);

    }

    /**
     * Function containing game flow
     *
     * @param player1move : captures player 1 action
     * @param totalRound : number of time the game continue
     */
    public void intiateGame(Moves player1move, int totalRound) {
        Moves player1 = player1move;

        int player1WinCounter = 0;
        int player2WinCounter = 0;
        int tieCounter = 0;

        int round = 0;
        while (round < totalRound) {
            Moves player2 = CustomUtil.getRandomMoves();
            if (player1.getMoveValue() > player2.getMoveValue()) {
                player1WinCounter++;
            } else if (player1.getMoveValue() < player2.getMoveValue()) {
                player2WinCounter++;
            } else {
                tieCounter++;
            }

            round++;
        }
        System.out.println("Player A wins " + player1WinCounter + " of " + totalRound + " games");
        System.out.println("Player B wins " + player2WinCounter + " of " + totalRound + " games");
        System.out.println("Tie: " + tieCounter + " of " + totalRound + " games");
    }


}
