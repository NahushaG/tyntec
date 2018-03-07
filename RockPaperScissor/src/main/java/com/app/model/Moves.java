package com.app.model;

/**
 * Created by nahusha on 07-03-2018.
 */
public enum Moves{
        ROCK(1),
        PAPER(2),
        SCISSOR(3);
        private int moveValue;

        Moves(int moveValue){
            this.moveValue=moveValue;
        }

        public int getMoveValue() {
            return moveValue;
        }
}
