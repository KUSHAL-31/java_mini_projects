package Projects;
import java.util.*;


class Library{
	private int noOfBooks;
	
	String books[] = new String[10];

	public String[] getBooks() {
		/*for(int i=0;i<books.length;i++) {
			System.out.println(books[i]);
		}*/
		return books;
	}

	public void setBooks(String[] books) {
			books[0]="HC VERMA";
			books[1]="RD SHARMA";
			books[2]="UNIVERSAL SOLUTIONS";
			books[3]="TECHMAX";
			books[4]="MT TATVA SOLUTIONS";
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	
	/*public void listOfBookslist of available books() {
		String[] books = new String[10];
		books[0]="HC VERMA";
		books[1]="RD SHARMA";
		books[2]="UNIVERSAL SOLUTIONS";
		books[3]="TECHMAX";
		books[4]="MT TATVA SOLUTIONS";
		for(int i=0;i<5;i++) {
			System.out.println((i+1) +") "+ books[i]);
			
	}*/	
	
	Library() {
		System.out.println("---------------------------------------------------------");
		System.out.println("LIBRARY MANAGEMENT SYSTEM...");
		System.out.println("---------------------------------------------------------\n");
		System.out.println("The list of Books available are : ");
		System.out.println();
		
	}

	public void addBooks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many books you want to add(maximum 5 books) : ");
		int n = sc.nextInt();
		setNoOfBooks(n);
		System.out.println("Enter the name of the book :");		
		String[] add = new String[n];
		for(int i=books.length;i<(n+books.length);i++)
		{
		books[i] = sc.nextLine();
		
	}		
	}
	
	public void issueBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which book you want to issue(Enter the number) : ");
		int bkn = sc.nextInt();
		if(bkn > books.length) {
			System.out.println("The required book is not present...try again");
			for(int i=bkn;i<books.length;i++) {
				books[i]=books[i+1];
		}
		}
		else {
		System.out.println("Thank you for SHOPPING......\n");
		System.out.println("You have issued the book ==" + books[bkn]);
		
		}
	}
}


public class LibraryManagmentSystem {

	public static void main(String[] args) {
		
		
		Library a = new Library();
		
		for(int i=0;i<5;i++) {
			System.out.println((i+1) + ") " + a.getBooks());
		}
		System.out.println("Which operation you want to perform : ");
		a.addBooks();
	}

}
