package Projects;

import java.util.Scanner;
import java.util.Random;

class StonePaperGame {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int opt=0;
int comp=0;
int count=0;
int compCount=0;
//Game FORMAT
System.out.println();
System.out.println("**********************************************\n");
System.out.println("WELCOME to Stone Paper Scissor GAME");
System.out.println();
System.out.println("You are playing against a computer...");
System.out.println();
System.out.println("ALL THE BEST !!!\n");
System.out.println("**********************************************\n");

//TAking OPTIONS from computer

//OPTIONS AVAILABLE for Player
System.out.println("Choose anyone object from the following : ");
System.out.println("1) STONE");
System.out.println("2) PAPER");
System.out.println("3) SCISSOR");
System.out.println("Press 0 to EXIT the Game and View SCORE\n");
do {
do {
	
	//Computer genrating a number 
	Random rand = new Random();
	comp = 1+rand.nextInt(3);
	
	
System.out.print("Your CHOICE  =  ");
opt = sc.nextInt();
if( opt > 3) {
	System.out.println("Wrong choice please ENTER AGAIN....\n");
}
	/*else if(opt==0) {
		System.out.println("\nYOU selected EXIT....THANK YOU for PLAYING");*/
	//}
}while(opt > 3);


//Game conditions

if(opt==1 && comp==3 || opt==2 && comp==1 || opt==3 && comp==2) {
	System.out.println("You WON....");
	compCount++;
}
else if(opt == comp) {
	System.out.println("It's a TIE....");
	count++;
}
else{
	System.out.println("You LOSE....");
	count++;
}	

if(comp==1) {
	System.out.println("Computer choice was STONE");
}
else if(comp==2) {
	System.out.println("Computer choice was PAPER");
}
else {
	System.out.println("Computer choice was SCISSOR");
}
}while (opt!=0);
System.out.println();
System.out.println("***********************************************************");
System.out.println("\nYOU selected EXIT....THANK YOU for PLAYING\n");
System.out.println("Your SCORE == " + count);
System.out.println("Computer SCORE == " + compCount);
System.out.println();
System.out.println("***********************************************************");

//GAme OVER

	}	
}
