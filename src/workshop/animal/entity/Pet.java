package workshop.animal.entity;

public interface Pet {
	// public이라는 키워드는 무조건 붙음
	String getName();
	void setName();
	
	// Illegal modifier for the interface method play; 
	// only public, abstract, default, static and strictfp are permitted
	// protected abstract void play();
	public abstract void play(); // 자동 추상 클래스
	
}
