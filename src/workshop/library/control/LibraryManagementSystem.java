package workshop.library.control;

import java.util.Scanner;

import workshop.library.entity.Book;
import workshop.library.entity.Library;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        Library library = new Library("�߾� ������");
        
        Scanner scanner = new Scanner(System.in);
        
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        
        
        addSampleBooks(library);
        
        for(Book book : library.getAllBooks()) {
	        System.out.println("������ �߰��Ǿ����ϴ�: " + book.getTitle());
        }
        
        System.out.println("===== "+library.getName()+" =====");
        System.out.println("��ü ���� ��: " + library.getTotalBooks());
        System.out.println("���� ���� ���� ��: " + library.getAvailableBooksCount());
        System.out.println("���� ���� ���� ��: " + library.getBorrowedBooksCount());
        
        testFindBook(library, title, author);
        
        
        testCheckOut(library);
        

        System.out.println("������ ���� ����: ");
        System.out.println("��ü ���� ��: " + library.getTotalBooks());
        System.out.println("���� ���� ���� ��: " + library.getAvailableBooksCount());
        System.out.println("���� ���� ���� ��: " + library.getBorrowedBooksCount());
        System.out.println();
        
        testReturn(library);
        
        System.out.println("������ ���� ����: ");
        System.out.println("��ü ���� ��: " + library.getTotalBooks());
        System.out.println("���� ���� ���� ��: " + library.getAvailableBooksCount());
        System.out.println("���� ���� ���� ��: " + library.getBorrowedBooksCount());
        System.out.println();
        
        
        displayAvailableBooks(library);
    }

    private static void addSampleBooks(Library library) {
        library.addBook(new Book("�ڹ� ���α׷���", "���ڹ�", "978-89-01-12345-6", 2022));
        library.addBook(new Book("��ü������ ��ǰ� ����", "����ȣ", "978-89-01-67890-1", 2015));
        library.addBook(new Book("Clean Code", "Robert C. Martin", "978-0-13-235088-4", 2008));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "978-0-13-468599-1", 2018));
        library.addBook(new Book("Head First Java", "Kathy Sierra", "978-0-596-00920-5", 2005));
        library.addBook(new Book("�ڹ��� ����", "���ü�", "978-89-01-14077-4", 2019));
    }

    private static void testFindBook(Library library, String title, String author) {
        System.out.println();
        System.out.println("===== ���� �˻� �׽�Ʈ  =====");
    	System.out.println("�������� �˻����: ");
        Book book = library.findBookByTitle(title);
        if (book != null) {
            System.out.println(book.toString());
        } else {
            System.out.println("å�� ã�� �� �����ϴ�.");
        }

        System.out.println();
        System.out.println("���ڷ� �˻� ���: ");
        book = library.findBookByAuthor(author);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("å�� ã�� �� �����ϴ�.");
        }
        System.out.println();
    }

    private static void testCheckOut(Library library) {
        System.out.println("===== ���� ���� �׽�Ʈ =====");
        String isbn = "978-0-13-235088-4";
        boolean result = library.checkOutBook(isbn);
        
        if (result) {
            System.out.println("���� ���� ����!");
            System.out.println("����� ���� ����: ");
            
            Book book = library.findBookByISBN(isbn);
            
            System.out.println(book);
        } else {
            System.out.println("���� ���� ����!");
        }
        System.out.println();
    }

    private static void testReturn(Library library) {
        System.out.println("===== ���� �ݳ� �׽�Ʈ =====");
        
        String isbn = "978-89-01-14077-4";
        
        boolean result = library.checkOutBook(isbn);
        
        if(result) {
        	boolean returnResult = library.returnBook(isbn);
        	
        	if(returnResult) {
        		System.out.println("���� �ݳ� ����!");
        		Book book = library.findBookByISBN(isbn);
        		
        		if(book.isAvailable()) {
        			System.out.println("�ݳ� �� ���� ����: ");
        			System.out.println(book);
        		}
        	}
        	else { 
        		System.out.println("�������� �ƴ϶� �ݳ� �Ұ�"); 
        	}
        } else {
        	System.out.println("����� ���� ����");
        }
        System.out.println();
        
    }

    private static void displayAvailableBooks(Library library) {
        System.out.println("===== ���� ������ ���� ��� =====");
        for (Book book : library.getAvailableBooks()) {
        	System.out.println(book);
        	System.out.println("------------------------");
        }
        System.out.println();
    }
}
