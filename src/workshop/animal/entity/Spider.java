package workshop.animal.entity;

public class Spider extends Animal{
	public Spider() {
		// Animal(8) ȣ��
		super(8); 
	}
	
	@Override
	public void eat() {
		System.out.println("Spider�� ���� ������ ���ְ� �Ծ��!!!");
	}
}
