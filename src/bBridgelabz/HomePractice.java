package bBridgelabz;

import java.util.Random;
import java.util.Scanner;
public class HomePractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int player1Position = 1;
        int player2Position = 1;

        System.out.println("Welcome to Snakes and Ladders!");

        while (player1Position < 100 && player2Position < 100) {
            // Player 1's turn
            System.out.println("\nPlayer 1, press enter to roll the dice.");
            scanner.nextLine();
            int diceRoll1 = random.nextInt(6) + 1;
            System.out.println("Player 1 rolled a " + diceRoll1);

            player1Position += diceRoll1;
            player1Position = checkForSnakesAndLadders(player1Position);

            System.out.println("Player 1 is now at position " + player1Position);

            if (player1Position >= 100) {
                System.out.println("Player 1 wins!");
                break;
            }

            // Player 2's turn
            System.out.println("\nPlayer 2, press enter to roll the dice.");
            scanner.nextLine();
            int diceRoll2 = random.nextInt(6) + 1;
            System.out.println("Player 2 rolled a " + diceRoll2);

            player2Position += diceRoll2;
            player2Position = checkForSnakesAndLadders(player2Position);

            System.out.println("Player 2 is now at position " + player2Position);

            if (player2Position >= 100) {
                System.out.println("Player 2 wins!");
                break;
            }
        }

        scanner.close();
    }

    private static int checkForSnakesAndLadders(int position) {
        Random random = new Random();
        int snakeOrLadder = random.nextInt(3); // 0: no snake or ladder, 1: ladder, 2: snake

        if (snakeOrLadder == 1) {
            int ladderJump = random.nextInt(20) + 1; // Jump between 1 and 20 positions
            System.out.println("Player encountered a ladder! Climbing to position " + (position + ladderJump) + ".");
            return position + ladderJump;
        } else if (snakeOrLadder == 2) {
            int snakeSlide = random.nextInt(20) + 1; // Slide between 1 and 20 positions
            System.out.println("Player encountered a snake! Sliding down to position " + (position - snakeSlide) + ".");
            return position - snakeSlide;
        } else {
            return position;
        }
    }
}



