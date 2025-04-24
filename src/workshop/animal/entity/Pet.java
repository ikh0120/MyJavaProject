package workshop.animal.entity;

// interface�� �ڵ����� public, abstract
public interface Pet {
	// public�̶�� Ű����� ������ ����
	String getName();
	void setName(String name);

	// protected abstract void play();	
	// Illegal modifier for the interface method play; 
	// only public, abstract, default, static and strictfp are permitted

	public abstract void play(); // �ڵ� �߻� �޼���
	
}
