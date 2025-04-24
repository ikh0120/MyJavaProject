package workshop.animal.control;

import workshop.animal.entity.Animal;
import workshop.animal.entity.Cat;
import workshop.animal.entity.Pet;

public class AnimalTest {

	public static void main(String[] args) {
		// Cat 객체 생성하는 3가지 방법 
		Cat cat1 = new Cat(); // Pet, Animal 두개 다 상속받아 메서드 5개 사용가능
		Pet cat2 = new Cat(); // Pet 타입이라 상속 3개만 됨
		Animal cat3 = new Cat(); // Animal 타입이라 2개 가능
		
		// Pet으로 부터 상속받은 메서드만 사용가능
		cat1.setName("톰");
		System.out.println(cat1.getName());
		cat1.play();
		
		// Animal로부터 상속받은 메서드만 사용가능
		cat1.eat();
		cat1.walk();
		
		// Pet으로부터 상속받은 메서드만 사용가능
		cat2.setName("이용");
		System.out.println(cat2.getName());
		cat2.play();
		
		//Animal로부터 상속받은 메서드만 사용가능
		cat3.eat();
		cat3.walk();
		
		
	}

}
