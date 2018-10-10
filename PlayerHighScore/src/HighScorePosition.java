
public class HighScorePosition {
	private String name;
	private int position;
	private int score;
	
	//default constructor
	HighScorePosition()
	{
		name = ""; //has no name
		position = 0; // is not on the leaderboard
		score = -1; // has no score
	}
	
	//set methods
	public void setName(String newName)
	{
		this.name = newName;
	}
	public void setScore(int newScore)
	{
		this.score = newScore;
	}
	
	
	//methods
	public int calculateHighScorePosition()
	{
		if(score >=1000)
			position = 1;
		else if(score>=500 && score <=1000)
			position = 2;
		else if(score>=100 && score <500)
			position = 3;
		else
			position = 4;
		return position;
	}
	public void scoreDisplay()
	{
		calculateHighScorePosition();
		System.out.println(name + " managed to get into position " + position + " on the high score table with the score of " + score);
	}
}
