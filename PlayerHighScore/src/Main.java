// Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        //

/**
 * Copyright (c) 2018, Railing Software. All rights reserved
 * 
 * This is a small, simple program which displays the name and the score of players
 * It contains three classes, each with its own method
 * The ScoreDisplay class has a method which displays the players information
 * The CaluclateScore class has a method that calculates the position of a player based on their score
 * @author Vass "Kristo" Krisztian
 * 
 */


public class Main {
	public static void main(String[] args)
	{
		HighScorePosition player1 = new HighScorePosition();
		player1.setName("Kristo");
		player1.setScore(400);
		player1.scoreDisplay();
		}
}
