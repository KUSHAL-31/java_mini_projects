package Projects;

import java.util.Scanner;
import java.util.Random;

class GuessGame{
	int Input;
	int Number;
	int noOfGuess=0;
	
	GuessGame() {
		Random rand = new Random();
		this.Number = rand.nextInt(100);
	}	
	
	public int getInput() {
		return Input;
	}

	public void setInput(int input) {
		Input = input;
	}

	boolean isCorrectNumber(){
		
		if(Input == Number) {
			noOfGuess++;
			System.out.println("\nCongratulations !!!!!!");
			return true;
		}		
		else if(Input < Number) {
			noOfGuess++;
			System.out.println("Too low...\n");
		}
		
		else if(Input > Number) {
			noOfGuess++;
			System.out.println("Too high....\n");
		}
		return false;
	}
	
}


public class GuessTheNumber {

	public static void main(String[] args) {

		GuessGame g = new GuessGame();
		boolean b=false;
		while(!b) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Guess the number : ");
			int input = sc.nextInt();
		g.setInput(input);
		b = g.isCorrectNumber();		
	}
		if(b==true) {
			System.out.println("The correct number was " + g.getInput());
			System.out.println("You guessed the number in " + g.noOfGuess + " attempts...");
			if(g.noOfGuess <= 5) {
				System.out.println("You are a PRO player");
			}
			else if(g.noOfGuess >= 10) {
				System.out.println("You are NOOB....");
			}
			else {
				System.out.println("You are an average player");
			}
		}
	}
}
