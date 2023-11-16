package com.BridgeLabz.Snakes_and_Ladder_game;

import java.util.*;
import java.util.Random;
public class SnakesAndLadder {
    public static void main(String[] args){
        Random rd = new Random();
        int diceCount = 0;

//        To initialise the position of player
        int playerPosition = 0;

//        To get Random number by dice for player1
        System.out.println("WELCOME TO JUNGLE SNAKE AND LADDER !!  ");
        while( playerPosition <100){
//            System.out.println("Press 'ENTER' to Roll the Dice !");
//            sc.nextLine();
            diceCount++;

            int diceRoll = rd.nextInt(6)+1;
            System.out.println("You got after roll the dice: " + diceRoll);
            if(playerPosition + diceRoll<=100){
                playerPosition = playerPosition + diceRoll;
            }

//            For checking case by the player
            int number = rd.nextInt(3);

            switch(number){
                case 0:
                    System.out.println(" In no Play condition: " + playerPosition + " ");
                            break;
//                To jump between 1 to 20
                case 1:
                    int ladderJump = rd.nextInt(20) + 1;
                    System.out.println(" Player1 chose to climb over up!  "+ (playerPosition + ladderJump) +" ");
                    if(playerPosition + ladderJump<=100){
                        playerPosition = playerPosition + ladderJump;
                    }
                            break;
//                To slide down between 1 to 20
                case 2:
                    int snakeSlide = rd.nextInt(20) + 1;
                    System.out.println("Player1 chose to slide down !  "+ (playerPosition + snakeSlide) + " ");
                    if (playerPosition - snakeSlide >0){
                        playerPosition = playerPosition - snakeSlide;
                    }
                            break;
                default:
                    System.out.println("Invalid option No Play: " + playerPosition);
                            break;
            }

        }
        System.out.println("Congratulations Player1 won the match at "+playerPosition+ " position. ");
        System.out.println("Total dice was played " + diceCount);

    }
}
