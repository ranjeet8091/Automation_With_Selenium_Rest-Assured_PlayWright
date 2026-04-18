package question8Library;

public class Main {
    public static void main(String[] args) {

    	  // Library
        Library lb = new Library("KNOWLEDGE", "LB1");
        
        lb.addBook(new Book("C-Programming", "John", "I-LB-1", false));
        lb.addBook(new Book("Java-Programming", "Jac", "I-LB-2", false));
        lb.addBook(new Book("C#-Programming", "Jatin", "I-LB-3", false));
        lb.addBook(new Book("Linux-Programming", "Ankur", "I-LB-4", false));
        lb.showAllPresentBookInLibrary();
       
        // New user Created
        User user1 = new User("Ranjeet", "CSE", "CSE-U1");

        // ⭐ USER REQUESTS LIBRARY
        user1.requestToIssueBook(lb, "C-Programming",true);
        user1.requestToIssueBook(lb, "Java-Programming",true);
        
        user1.requestToUnIssueBook(lb, "C-Programming",false);
        
        
        // Library Operation
        Book CProgramingBook= lb.searchBook("C-Programming");
        Book b1= lb.searchBook("C-Programming");
        lb.removeBook(CProgramingBook);

        // User  operation
        user1.showIssuedBook();
      
        lb.showAllPresentBookInLibrary();
    }
}
