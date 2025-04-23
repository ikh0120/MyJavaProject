package workshop.book.entity;

public class Magazine extends Publication {
	private String publishingPeriod;
	
	public Magazine() {
		
	}

	public Magazine(String title, String publishingDate, int page, int price, String publishingPeriod) {
		super(title, publishingDate, page, price); // �θ� ������ ȣ��
		this.publishingPeriod = publishingPeriod;
	}
	
	// �θ� ������ �ƴ϶� �ڱ� �ڽ��� ������ Getter, Setter�� �̷��� ����
	public String getPublishingPeriod() {
		return publishingPeriod;
	}
	
	public void setPublishingPeriod(String publishingPeriod) {
		this.publishingPeriod = publishingPeriod;
	}
	
}
