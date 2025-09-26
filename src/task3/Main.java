package task3;

public class Main {
	
	    public static void main(String[] args) {
	        Library library = new Library();

	        // Adding some books
	        Book b1 = new Book("Java Basics", "James Gosling");
	        Book b2 = new Book("Python Crash Course", "Eric Matthes");
	        Book b3 = new Book("C++ Primer", "Stanley Lippman");

	        library.addBook(b1);
	        library.addBook(b2);
	        library.addBook(b3);

	        // Users
	        User u1 = new User("Alice", 101);
	        User u2 = new User("Bob", 102);

	        // Show books
	        library.showAvailableBooks();

	        // Issue and return
	        library.issueBook("Java Basics", u1);
	        library.showAvailableBooks();

	        library.returnBook("Java Basics", u1);
	        library.showAvailableBooks();

	        // Trying to issue unavailable book
	        library.issueBook("Unknown Book", u2);
	    }
	}



