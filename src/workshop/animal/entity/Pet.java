package workshop.animal.entity;

public interface Pet {
	// public�̶�� Ű����� ������ ����
	String getName();
	void setName();
	
	// Illegal modifier for the interface method play; 
	// only public, abstract, default, static and strictfp are permitted
	// protected abstract void play();
	public abstract void play(); // �ڵ� �߻� Ŭ����
	
}
