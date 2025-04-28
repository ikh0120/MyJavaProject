package workshop.library.entity;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books; //도서 목록
	private String name; //도서관 이름
	

	
	public Library(String name) {
		this.name=name;
		this.books = new ArrayList<>();
	}

	public String getName() { return this.name; }
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public Book findBookByTitle(String title) {
		for(int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
		
			if(book.getTitle().equals(title) == true) {
				return book;
			}
		}
		return null;

	}
	
	public Book findBookByAuthor(String author) {
	    for (Book book : books) {
	        if (book.getAuthor().equals(author)) {
	            return book;
	        }
	    }
	    return null;
	}
	
	public Book findBookByISBN(String ISBN) {
		for(int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
		
			if(book.getIsbn().equals(ISBN) == true) {
				return book;
			}
		}
		return null;
	}
	
	public boolean checkOutBook(String isbn) {
		for(Book book : books) {
			if (book.getIsbn().equals(isbn)) {
				if (book.isAvailable() == true) {
					book.checkOut();
					return true;
				} else { return false; }
			}
		}
		return false;
		
	}
	
	public boolean returnBook(String isbn) {
		for(Book book : books) {
			if(book.getIsbn().equals(isbn)) {
				if (book.isAvailable() == false) {
					book.returnBook();
					return true;
				} else { return false; }
			}
		}
		return false;
	}
	
	public List<Book> getAvailableBooks() {
		List<Book> ableBooks = new ArrayList<>();
		
		for(Book book : books) {
			if (book.isAvailable() == true) {
				ableBooks.add(book);
			}
		}
		return ableBooks;
	}
	
	public List<Book> getAllBooks(){ return books; }
	
	public int getTotalBooks() { return books.size(); }
	
	public int getAvailableBooksCount() {
	    int cnt = 0;
	    for (Book book : books) {
	        if (book.isAvailable() == true) {
	            cnt++;
	        }
	    }
	    return cnt;
	}
	
	public int getBorrowedBooksCount() {
	    int cnt = 0;
	    for (Book book : books) {
	        if (book.isAvailable() == false) {
	            cnt++;
	        }
	    }
	    return cnt;
	}

	
}
