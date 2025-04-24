package workshop.animal.entity;

// interface는 자동으로 public, abstract
public interface Pet {
	// public이라는 키워드는 무조건 붙음
	String getName();
	void setName(String name);

	// protected abstract void play();	
	// Illegal modifier for the interface method play; 
	// only public, abstract, default, static and strictfp are permitted

	public abstract void play(); // 자동 추상 메서드
	
}
