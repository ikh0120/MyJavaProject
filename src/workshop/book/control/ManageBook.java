package workshop.book.control;

import workshop.book.entity.Magazine;
import workshop.book.entity.Novel;
import workshop.book.entity.Publication;

public class ManageBook {

	public static void main(String[] args) {
		// Publication 타입의 배열을 선언 및 생성
		Publication[] pubs = new Publication[5];
		pubs[0] = new Magazine("마이크로소프트","2007-10-01",328,9900,"매월");
		
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
				
	}

}
