package question8Library;

import java.util.ArrayList;

public class Library {

	public String lbName;
	public String lbId;

	public ArrayList<Book> books = new ArrayList<>();

	public Library() {
	}

	public Library(String lbName, String lbId) {
		this.lbName = lbName;
		this.lbId = lbId;
	}

	public void addBook(Book b) {
		books.add(b);
	}

	public void removeBook(Book b) {

		for (Book b1 : books) {
			if (b1.title.equalsIgnoreCase(b.title)) {
				books.remove(b);
				b.makeBorrowed(false);
				return;
			}
		}
		System.out.println("Book is not found so we cant't remove");
		
	}

	// Library checks availability
	public Book searchBook(String keyword) {
		for (Book b : books) {
			if (b.title.equalsIgnoreCase(keyword) || b.author.equalsIgnoreCase(keyword)) {
				return b;
			}
		}
		return null;
	}

	// Library handles request
	public void processBookRequest(User user, String title,boolean Need) {

		Book book = searchBook(title);
		System.out.println();
		System.out.println("----------------- Request of issued and Unissued Request -----------");

		if (book == null) {
			System.out.println(" Book not found in library");
			return;
		}
         
		if(Need) {
			if (book.isBorrowed) {
				System.out.println(" Book already issued");
				return;
			}

			book.makeBorrowed(true);
			user.userIssuedBook.add(book);

			System.out.println(" Book   ( "+ title + ")issued to " + user.name);
		}
		else
		{
			if (book.isBorrowed) {
				book.makeBorrowed(false);
				user.userIssuedBook.remove(book);
				System.out.println(" Book   ( "+ title + ")Unissued to " + user.name);
			}
		}
		
	}

	public void showAllPresentBookInLibrary() {
		System.out.println();
		System.out.println("-----------------All Books that are Present Library-----------");
		int count = 1;
		for (Book book : books) {
			System.out.println(count++ + ". Book name: " + book.title + " | ISBN: " + book.ISBN);
		}
	}
}
