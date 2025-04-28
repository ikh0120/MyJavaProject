package workshop.library.control;

import java.util.Scanner;

import workshop.library.entity.Book;
import workshop.library.entity.Library;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library("중앙 도서관");
        
        Scanner scanner = new Scanner(System.in);
        
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        
        
        addSampleBooks(library);
        
        for(Book book : library.getAllBooks()) {
	        System.out.println("도서가 추가되었습니다: " + book.getTitle());
        }
        
        System.out.println("===== "+library.getName()+" =====");
        System.out.println("전체 도서 수: " + library.getTotalBooks());
        System.out.println("대출 가능 도서 수: " + library.getAvailableBooksCount());
        System.out.println("대출 중인 도서 수: " + library.getBorrowedBooksCount());
        
        testFindBook(library, title, author);
        
        
        testCheckOut(library);
        

        System.out.println("도서관 현재 상태: ");
        System.out.println("전체 도서 수: " + library.getTotalBooks());
        System.out.println("대출 가능 도서 수: " + library.getAvailableBooksCount());
        System.out.println("대출 중인 도서 수: " + library.getBorrowedBooksCount());
        System.out.println();
        
        testReturn(library);
        
        System.out.println("도서관 현재 상태: ");
        System.out.println("전체 도서 수: " + library.getTotalBooks());
        System.out.println("대출 가능 도서 수: " + library.getAvailableBooksCount());
        System.out.println("대출 중인 도서 수: " + library.getBorrowedBooksCount());
        System.out.println();
        
        
        displayAvailableBooks(library);
    }

    private static void addSampleBooks(Library library) {
        library.addBook(new Book("자바 프로그래밍", "김자바", "978-89-01-12345-6", 2022));
        library.addBook(new Book("객체지향의 사실과 오해", "조영호", "978-89-01-67890-1", 2015));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0-13-235088-4", 2008));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "978-0-13-468599-1", 2018));
        library.addBook(new Book("Head First Java", "Kathy Sierra", "978-0-596-00920-5", 2005));
        library.addBook(new Book("자바의 정석", "남궁성", "978-89-01-14077-4", 2019));
    }

    private static void testFindBook(Library library, String title, String author) {
        System.out.println();
        System.out.println("===== 도서 검색 테스트  =====");
    	System.out.println("제목으로 검색결과: ");
        Book book = library.findBookByTitle(title);
        if (book != null) {
            System.out.println(book.toString());
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }

        System.out.println();
        System.out.println("저자로 검색 결과: ");
        book = library.findBookByAuthor(author);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }
        System.out.println();
    }

    private static void testCheckOut(Library library) {
        System.out.println("===== 도서 대출 테스트 =====");
        String isbn = "978-0-13-235088-4";
        boolean result = library.checkOutBook(isbn);
        
        if (result) {
            System.out.println("도서 대출 성공!");
            System.out.println("대출된 도서 정보: ");
            
            Book book = library.findBookByISBN(isbn);
            
            System.out.println(book);
        } else {
            System.out.println("도서 대출 실패!");
        }
        System.out.println();
    }

    private static void testReturn(Library library) {
        System.out.println("===== 도서 반납 테스트 =====");
        
        String isbn = "978-89-01-14077-4";
        
        boolean result = library.checkOutBook(isbn);
        
        if(result) {
        	boolean returnResult = library.returnBook(isbn);
        	
        	if(returnResult) {
        		System.out.println("도서 반납 성공!");
        		Book book = library.findBookByISBN(isbn);
        		
        		if(book.isAvailable()) {
        			System.out.println("반납 된 도서 정보: ");
        			System.out.println(book);
        		}
        	}
        	else { 
        		System.out.println("대출중이 아니라 반납 불가"); 
        	}
        } else {
        	System.out.println("대출된 도서 없음");
        }
        System.out.println();
        
    }

    private static void displayAvailableBooks(Library library) {
        System.out.println("===== 대출 가능한 도서 목록 =====");
        for (Book book : library.getAvailableBooks()) {
        	System.out.println(book);
        	System.out.println("------------------------");
        }
        System.out.println();
    }
}
