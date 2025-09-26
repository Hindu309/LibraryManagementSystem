package task3;

	import java.util.ArrayList;

	public class Library {
	    private ArrayList<Book> books;

	    public Library() {
	        books = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println(book.getTitle() + " added to library.");
	    }

	    public void showAvailableBooks() {
	        System.out.println("\n📚 Available Books:");
	        for (Book book : books) {
	            if (!book.isIssued()) {
	                System.out.println(book);
	            }
	        }
	    }

	    public void issueBook(String title, User user) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
	                book.issueBook();
	                System.out.println(user.getName() + " issued " + title);
	                return;
	            }
	        }
	        System.out.println("❌ Book not available: " + title);
	    }

	    public void returnBook(String title, User user) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
	                book.returnBook();
	                System.out.println(user.getName() + " returned " + title);
	                return;
	            }
	        }
	        System.out.println("❌ Book not found or not issued: " + title);
	    }
	}



