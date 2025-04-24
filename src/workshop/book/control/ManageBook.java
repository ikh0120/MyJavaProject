package workshop.book.control;

import workshop.book.entity.Magazine;
import workshop.book.entity.Novel;
import workshop.book.entity.Publication;
import workshop.book.entity.ReferenceBook;

public class ManageBook {

	public static void main(String[] args) {
		// Publication 타입의 배열을 선언 및 생성
		Publication[] pubs = new Publication[5];
		pubs[0] = new Magazine("마이크로소프트","2007-10-01",328,9900,"매월");
		pubs[1] = new Magazine("경영과컴퓨터","2007-10-03",316,9000,"매월");
		pubs[2] = new Novel("빠삐용","2007-07-01",396,9800,"베르나르베르베르","현대소설");
		pubs[3] = new Novel("남한산성","2007-04-14",383,11000,"김훈","대하소설");
		pubs[4] = new ReferenceBook("실용주의프로그래머","2007-01-14",496,25000,"소프트웨어공학");
			
		for (Publication publication : pubs) {
			System.out.println(publication.toString());// toString() 안써도 됨
		}
		
		Publication pub2 = pubs[2];
		System.out.println("=== 가격 변경 전 ===");
		System.out.println(pub2.getTitle() + " " + pub2.getPrice());
		modifyPrice(pubs[2]);
		
		System.out.println("=== 가격 변경 후 ===");
		System.out.println(pub2.getTitle() + " " + pub2.getPrice());
		
		/*
		// Magazine 객체 생성
		Magazine mz = new Magazine(); // 자기가 만든거도 가능
		// mz 변수로 호출 가능한 메서드는 5개
		Publication pub = new Magazine();// 자기가 만든거는 불가능
		// pub 변수로 호출 가능한 메서드는 4개
		
		// Novel 객체 생성
		Novel novel = new Novel(); // Alt + Shift + L로 new Novel();까지만 하고 만들 수 있음
		Publication pub2 = new Novel();
		// Publication으로 선언한 부모로 묶을 수 있어 한꺼번에 핸들링 가능함!!!! 
		// 이게 다형성임
		*/
		
		for (Publication publication : pubs) {
			printSubInfo(publication);
		}
		
				
	}
	
	//하위(Sub)클래스들이 단독으로 가지고 있는 정보를 출력하는 메서드
	public static void printSubInfo(Publication pub) {
		if(pub instanceof Magazine) {
			Magazine m = (Magazine)pub;
			System.out.println(m.getPublishingPeriod());
		}
		if(pub instanceof Novel) {
			Novel n = (Novel)pub;
			System.out.println(n.getAuthor() + " " + n.getGenre());
		}
		if(pub instanceof ReferenceBook) {
			ReferenceBook r = (ReferenceBook)pub;
			System.out.println(r.getField());
		}
	}
	
	// 다형적 아규먼트(Polymorphic Argument)
	// 부모 클래스 값을 인자로 넣지 않으면 각각의 자식 객체에 대한 메서드를 하나하나 다 만들어줘야 함
	public static void modifyPrice(Publication pub) {
		double rate = 0.0;
		if(pub instanceof Magazine) {
			rate = 0.6; //40%
		}
		if(pub instanceof Novel) {
			rate = 0.8; //20%
		}
		if(pub instanceof ReferenceBook) {
			rate = 0.9; //10%
		}
		
		pub.setPrice((int)(pub.getPrice() * rate));
		
	} //Publication p = new Magazine();
	
	//Polymorphic Argument 개념을 적용하지 않고, 하위클래스 타입별로 메서드 정의
	//	public void mPrice(Magazine m) {
	//		
	//	}
	//	
	//	public void mPrice(Novel n) {
	//		
	//	}
	//	
	//	public void mPrice(ReferenceBook r) {
	//		
	//	}

	
	
}
