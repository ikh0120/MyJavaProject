package workshop.animal.entity;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	// 추상 메서드라 밑의 자식 클래스에서 만들거
	public abstract void eat();
	
	public void walk() {
		System.out.println("동물은 " + legs + "발로 걸어요. ");
	}
	
}
