package workshop.animal.control;

import workshop.animal.entity.Animal;
import workshop.animal.entity.Cat;
import workshop.animal.entity.Pet;

public class AnimalTest {

	public static void main(String[] args) {
		// Cat ��ü �����ϴ� 3���� ��� 
		Cat cat1 = new Cat(); // Pet, Animal �ΰ� �� ��ӹ޾� �޼��� 5�� ��밡��
		Pet cat2 = new Cat(); // Pet Ÿ���̶� ��� 3���� ��
		Animal cat3 = new Cat(); // Animal Ÿ���̶� 2�� ����
		
		// Pet���� ���� ��ӹ��� �޼��常 ��밡��
		cat1.setName("��");
		System.out.println(cat1.getName());
		cat1.play();
		
		// Animal�κ��� ��ӹ��� �޼��常 ��밡��
		cat1.eat();
		cat1.walk();
		
		// Pet���κ��� ��ӹ��� �޼��常 ��밡��
		cat2.setName("�̿�");
		System.out.println(cat2.getName());
		cat2.play();
		
		//Animal�κ��� ��ӹ��� �޼��常 ��밡��
		cat3.eat();
		cat3.walk();
		
		
	}

}
