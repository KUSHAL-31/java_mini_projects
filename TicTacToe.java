package Projects;
import java.util.*;


class TicTacToe {
	
	char[][] gameBoard = {{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
	
void toss(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your choice ...1 for HEADS or 2 for TAILS : \n");
		int choice = sc.nextInt();
		
	}
	
	TicTacToe() {
		for (char[] cs : gameBoard) {
			System.out.println(cs);
		}
	}
	
	
	public static void main(String[] args) {
		
		TicTacToe t = new TicTacToe();

	}

}
