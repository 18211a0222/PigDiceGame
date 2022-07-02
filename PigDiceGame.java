package com.monocept.model;

import java.util.Scanner;

public class PigDiceGame {
	public static void main(String[] args) {
		char RollorHold;
		int turnscore = 0, totalscore = 0, turn = 1;
		System.out.println("TURN " + turn + ":");
		System.out.println("\nWelcome to the game of Pig! ");
		Scanner sc = new Scanner(System.in);
		while (totalscore < 20) { // run a loop until the total score is less than 20
			System.out.println("\nEnter 'r' to roll again, 'h' to hold. ");
			RollorHold = sc.next().charAt(0); //reading the input character from the user
			if (RollorHold == 'r') { // this if else is for 'r' or 'h' input from user if it is r we roll the dice
				int diceroll = (int) Math.floor(Math.random() * (6) + 1); //  this gives a random number between 1 and 6 like a dice
				System.out.println("You rolled: " + diceroll);
				if (diceroll == 1) { // in this if else, if the dice roll is 1 we end the turn and make the turn score zero as turn ended.
					System.out.println("Turn over. No Score");
					turnscore = totalscore; // as turn ended, the turn score is made to total score we have saved by holding 
					turn += 1; // as the turn ended we go to next turn
					System.out.println("\nTURN " + turn + ":");
					System.out.println("\nWelcome to the game of Pig! ");
				} else {
					turnscore += diceroll; // we add the dice value until the user holds the present turn score
					if (turnscore >= 20) { //in this if else, if the turn score is greater than 20, the user can just hold and finish the game 
						System.out.println("Your turn score is " + turnscore + " and your total score is " + turnscore);
						System.out.println("You Win! You finished in " + turn + " turns!");
						System.out.println("\nGame over!");
						break;
					} else { // else we suggest him to hold the turn score
						System.out.println("Your turn score is " + turnscore + " and your total score is " + totalscore);
						System.out.println("If you hold, you will have " + turnscore + " points.")
					}
				}
			} else if (RollorHold == 'h') {
				totalscore = turnscore; // if the user wants to hold the turn score will be saved to total score
				System.out.println("Your turn score is " + turnscore + " and your total score is " + totalscore);
				turn += 1; // by ending the present turn we are saving the current turn score
				System.out.println("\nTURN " + turn + ":");
			}
		}
	}

}
