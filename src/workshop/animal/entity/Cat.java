package workshop.animal.entity;

public class Cat extends Animal implements Pet {
	private String name;
	
	public Cat(String name) {
		super(4); // super(4); == Animal(4);
		setName(name);
	}
	
	public Cat() {
		this(""); // �ٷ� �� Cat(String name){} ȣ��
	}

	//Source -> Override/implement Methods ... ���� �Ѳ����� ������
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;		
	}

	@Override
	public void play() {
		System.out.println("����̴� ��ȭ�� �Ű� ��ƿ�!");
	}

	@Override
	public void eat() {
		System.out.println("����̴� ������ �Ծ��!");
		
	}
	

}
