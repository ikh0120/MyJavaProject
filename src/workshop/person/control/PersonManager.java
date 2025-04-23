package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {
	public static void main(String[] args) {
		/*
		 *  persons는 PersonEntity[] 배열 타입
		 *  persons[0]은 PersonEntity 타입
		 */
		// PersonEntity 타입인 배열 선언 및 생성
		PersonEntity[] persons = new PersonEntity[2];
		// PersonEntity 객체 생성
		// PersonEntity person = new PersonEntity();

		// 각각의 PersonEntity 배열에 값을 초기화
		persons[0] = new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932");
		persons[1] = new PersonEntity("김하늘","7302132363217", "서울 강동구", "02-362-1932");
		
		
		//Enhanced for Loop
		for(PersonEntity person : persons) {
			System.out.println(person.getName() + " " + person.getGender() + " " + person.getPhone());
		}
	}
}
