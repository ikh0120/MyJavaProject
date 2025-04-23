package workshop.person.entity;

public class PersonEntity {
	private String name;
	private char gender;
	private String ssn;
	private String address;
	private String phone;
	
	public PersonEntity() {
		
	}

	public PersonEntity(String name, String ssn, String address, String phone) {
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.phone = phone;
	}
	
}
