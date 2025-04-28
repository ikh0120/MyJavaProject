package workshop.library.entity;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private int publishYear;
	private boolean isAvailable;
	
	public Book() {
		this.isAvailable = true;
	}
	
	public Book(String title, String author, String isbn, int publishYear) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publishYear = publishYear;
		this.isAvailable = true;
	}
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }

	public String getIsbn() { return isbn; }
	public void setIsbn(String isbn) { this.isbn = isbn;}

	public int getPublishYear() { return publishYear; }
	public void setPublishYear(int publishYear) { this.publishYear = publishYear; }

	public boolean isAvailable() { return isAvailable; }
	public void setAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }
	

	public boolean checkOut() { 
		if(isAvailable == true) {
			isAvailable = false;
			return true;
		}
		return false;
	}
	
	public void returnBook() {
		isAvailable = true;
	}
	
	@Override
	public String toString() {
		String returnString;
		if (isAvailable == true) {
			returnString = "가능"; 
		}
		else {
			returnString = "대출 중"; 
		}
		
		return 	"책 제목:" + this.title +
				"\t저자:" + this.author+
				"\tISBN:" + this.isbn+
				"\t출판년도:" + this.publishYear+
				"\t대출 가능 여부: " + returnString;
	}
}
