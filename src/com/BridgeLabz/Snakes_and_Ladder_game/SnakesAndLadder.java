package com.BridgeLabz.Snakes_and_Ladder_game;

import java.util.*;
import java.util.Random;
public class SnakesAndLadder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
//        To initialise the 

        int PLAYER1_POSITION = 0;

        System.out.println("WELCOME TO JUNGLE SNAKE AND LADDER !!");
        while( PLAYER1_POSITION < 100){
            System.out.println("Press 'ENTER' to Roll the Dice !");
            sc.nextLine();

            int diceRoll = rd.nextInt(6)+1;
            System.out.println("You got after roll the dice: " + diceRoll);


        }

    }
}
