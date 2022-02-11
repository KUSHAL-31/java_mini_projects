package Projects;
import java.util.*;

class LibraryCopy{
	int noOfBooks;
	String books[];
	Scanner sc = new Scanner(System.in);
	int choice;
	String book;
	
	LibraryCopy() {
		this.noOfBooks=0;
		this.books = new String [100];
		System.out.println("Welcome to Kushal's LIBRARY......");
		System.out.println("Select any of the following options : ");
		System.out.println("1)View Books\n2)Add Book\n3)Return Book\n4)Issue Book");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			
			break;

		default:
			break;
		}
	}
	
	void addBooks() {
		System.out.println("Enter the name of the book you want to add : ");
		book = sc.nextLine();
		this.books[noOfBooks]=book;
		noOfBooks++;
		System.out.println(book.toUpperCase() + " has been added !");
	}
	
	
	void ViewBooks() {
		for(int i=0;i<books.length;i++) {
			if(books[i]!=null) {
			System.out.println("* " + books[i].toUpperCase());
		}
			else {
				continue;
			}
		}
	}
}

public class Cwh_Library {

	public static void main(String[] args) {
		LibraryCopy lib = new LibraryCopy();
		lib.addBooks();
		lib.ViewBooks();
		
	}

}
