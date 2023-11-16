package com.BridgeLabz.Snakes_and_Ladder_game;

import java.util.*;
import java.util.Random;
public class SnakesAndLadder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

//        To initialise the position of player
        int PLAYER1_POSITION = 0;

//        To get Random number by dice for player1
        System.out.println("WELCOME TO JUNGLE SNAKE AND LADDER !!");
        while( PLAYER1_POSITION < 100){
            System.out.println("Press 'ENTER' to Roll the Dice !");
            sc.nextLine();

            int diceRoll = rd.nextInt(6)+1;
            System.out.println("You got after roll the dice: " + diceRoll);

            PLAYER1_POSITION = PLAYER1_POSITION + diceRoll;

//            For checking case by the player
            int number = rd.nextInt(3);

            switch(number){
                case 0:
                    System.out.println(" In no Play condition: " + PLAYER1_POSITION + " ");
                            break;
//                To jump between 1 to 20
                case 1:
                    int ladderJump = rd.nextInt(20) + 1;
                    System.out.println(" Player1 chose to climb over there !"+ (PLAYER1_POSITION + ladderJump) +" ");
                    PLAYER1_POSITION = PLAYER1_POSITION + ladderJump;
                            break;
//                To slide down between 1 to 20
                case 2:
                    int snakeSlide = rd.nextInt(20) + 1;
                    System.out.println("Player1 chose to slide down over there !"+ (PLAYER1_POSITION + snakeSlide) + " ");
                    PLAYER1_POSITION = PLAYER1_POSITION - snakeSlide;
                            break;
                default:
                    System.out.println("Invalid option No Play: " + PLAYER1_POSITION);
                            break;

            }



        }

    }
}
