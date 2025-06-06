package workshop.book.entity;

public class Publication {
	private String title;
	private String publishingDate;
	private int page;
	private int price;

	public Publication() {
	}

	public Publication(String title, String publishingDate, int page, int price) {
		this.title = title;
		this.publishingDate = publishingDate;
		this.page = page;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(String publishingDate) {
		this.publishingDate = publishingDate;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return this.title;
	}
}