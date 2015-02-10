package java24;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total =0;
		int score =8;
		
		if (score == 7) {
			System.out.println("You score a touchdown!");
		}
		if (score == 3)	{
			System.out.println("You kick a field goal!");
		}
		else {
			//score equals score plus 2
			score += 2;
		}
		total = total + score;
		System.out.println("Total score: " + total)	;
		
		//loop test
		int playerscore = 12000;
		int playerLives = 3;
		int difficultyLevel = 10;
		
		if (playerscore > 9999) {
				playerLives++;
				System.out.println("Extra Life");
				difficultyLevel += 5;
		}
		
		}
		
		
		}
	

