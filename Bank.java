package Projects;

import java.util.Scanner;

class Bank {
	protected String name;
	protected int id;
	protected double bal;
	
	public void readata(String n , int i , int b) {
		name = n;
		id = i;
		bal=b;
	}

	public void withdraw(int amount) {
		if(bal > amount) {
			bal = bal - amount;
			System.out.println("You successfully withdrew Rs " + amount);
		}
		else {
			System.out.println("Insufficient balance......");
		}
	}
	
	public void deposit(int amount) {
		bal = bal + amount;
		System.out.println("Amount of Rs " + amount + " successfully deposited");
	}
	
	public void checkBalance() {
		System.out.println("Id number = " + id);
		System.out.println("Name = " + name.toUpperCase());
		System.out.println("Balance = " + bal);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank acc = new Bank();

System.out.println();
System.out.println("WELCOME TO K31 BANK ");
System.out.println("Please ENTER the following details : ");
System.out.println();
System.out.println("***********************************\n");
int i=0;
do {
System.out.print("Enter your bank ID : ");
i = sc.nextInt();
if(i != 311201) {
	System.out.println("Invalid Id PLEASE TRY AGAIN.......");
	System.out.println();
}
}while(i != 311201);

String s = sc.nextLine();
System.out.print("Enter your Name : ");
String n = sc.nextLine();

    System.out.print("Enter your current Balance : ");
	int b = sc.nextInt();
	
	acc.readata(n, i, b);
	int ch=0;
	
	System.out.println();
	System.out.println("*********************************");
	System.out.println("1) Withdraw amount ");
	System.out.println("2) Deposit amount ");
	System.out.println("3) Check your balance");
	System.out.println("4) Exit");
	System.out.println("*********************************");
	System.out.println();
	while(ch<4) {
	System.out.print("Enter your choice to perform the follwing operations : ");
	ch = sc.nextInt();
	System.out.println();
	
		switch (ch) {
		case 1 :
			System.out.println("Enter the amount you want to withdraw : ");
			int amount = sc.nextInt();
			acc.withdraw(amount);
			System.out.println();
			System.out.println("*********************************");
			break;
        case 2 :
			System.out.println("Enter the amount you want to deposit : ");
			amount = sc.nextInt();
			acc.deposit(amount);
			System.out.println();
			System.out.println("**********************************");
			break;
        case 3 :
 			acc.checkBalance();
 			System.out.println();
 			System.out.println("**********************************");
 			break;
         
		default:
			System.out.println("<<<<<<< Thank you for visiting , have a NICE DAY >>>>>>>");
			break;
	  }
    }
  }
}





