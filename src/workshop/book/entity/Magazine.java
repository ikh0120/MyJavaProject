package workshop.book.entity;

public class Magazine extends Publication {
	private String publishingPeriod;
	
	public Magazine() {
		
	}

	public Magazine(String title, String publishingDate, int page, int price, String publishingPeriod) {
		super(title, publishingDate, page, price); // 부모 생성자 호출
		this.publishingPeriod = publishingPeriod;
	}
	
	// 부모 변수가 아니라 자기 자신의 변수라서 Getter, Setter를 이렇게 선언
	public String getPublishingPeriod() {
		return publishingPeriod;
	}
	
	public void setPublishingPeriod(String publishingPeriod) {
		this.publishingPeriod = publishingPeriod;
	}
	
}
