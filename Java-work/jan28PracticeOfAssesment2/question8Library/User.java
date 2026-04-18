package question8Library;

import java.util.ArrayList;

public class User {

	String name;
	String department;
	String userId;

	ArrayList<Book> userIssuedBook = new ArrayList<>();

	public User(String name, String department, String userId) {
		this.name = name;
		this.department = department;
		this.userId = userId;
	}

	// ⭐ User requests library
	public void requestToIssueBook(Library library, String title,boolean Need) {
		library.processBookRequest(this, title,Need);
	}
	public void requestToUnIssueBook(Library library, String title,boolean Need) {
		library.processBookRequest(this, title,Need);
	}

	public void showIssuedBook() {
		System.out.println();
		System.out.println("-----------------All Books that are issued for this user--------------------");
		System.out.println("UserName: " + name + " | UserID: " + userId);

		if (userIssuedBook.isEmpty()) {
			System.out.println("No books issued");
			return;
		}

		int count = 1;
		for (Book book : userIssuedBook) {
			System.out.println(count++ + ". Book name: " + book.title + " | ISBN: " + book.ISBN);
		}
	}
}
