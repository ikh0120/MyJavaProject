package workshop.animal.entity;

public class Spider extends Animal{
	public Spider() {
		// Animal(8) 호출
		super(8); 
	}
	
	@Override
	public void eat() {
		System.out.println("Spider는 작은 벌레를 맛있게 먹어요!!!");
	}
}
