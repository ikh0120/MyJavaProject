package mylab.book.entity;

public class ReferenceBoook extends Publication {
	private String field;
	
	public ReferenceBoook() {}

	public ReferenceBoook(String title, String publishingDate, int page, int price, String field ) {
		super(title, publishingDate, page, price);
		this.field = field;
	}

	public String getField() {
		return field;
	}
	
	public void setField(String field) {
		this.field = field;
	}
}