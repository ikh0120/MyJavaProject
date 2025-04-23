package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {
	public static void main(String[] args) {
		/*
		 *  persons는 PersonEntity[] 배열 타입
		 *  persons[0]은 PersonEntity 타입
		 */
		// PersonEntity 타입인 배열 선언 및 생성
		PersonEntity[] persons = new PersonEntity[10];
		// PersonEntity 객체 생성
		// PersonEntity person = new PersonEntity();
		
		// 메서드로 만들고 싶은거 드래그하고 우클릭 / Refactor / Extract Method
		// static으로 선언되는데 static 빼버리면 다시 자기 클래스를 호출해서 메서드를 사용해야 됨
		PersonManager mgr = new PersonManager();
		mgr.fillPersons(persons);
		
		
		
		//Enhanced for Loop
		for(PersonEntity person : persons) {
			System.out.println(person.getName() + " " + person.getGender() + " " + person.getPhone());
		}
		
		
	}

	// non-static method
	public void fillPersons(PersonEntity[] persons) {
		// 각각의 PersonEntity 배열에 값을 초기화
		persons[0] = new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932");
		persons[1] = new PersonEntity("김하늘","7302132363217", "서울 강동구", "02-362-1932");
		persons[2] = new PersonEntity("박영수","7503111233201", "서울 성북구", "02-887-1542");
		persons[3] = new PersonEntity("나인수","7312041038988", "대전 유성구", "032-384-2223");
		persons[4] = new PersonEntity("홍정수","7606221021341", "서울 양천구", "02-158-7333");
		persons[5] = new PersonEntity("이미숙","7502142021321", "서울 강서구", "02-323-1934");
		persons[6] = new PersonEntity("박성구","7402061023101", "서울 종로구", "02-308-0932");
		persons[7] = new PersonEntity("유성미","7103282025101", "서울 은평구", "02-452-0939");
		persons[8] = new PersonEntity("황재현","7806231031101", "인천 중구", "032-327-2202");
		persons[9] = new PersonEntity("최철수","7601211025101", "인천 계양구", "032-122-7832");


	}
}
