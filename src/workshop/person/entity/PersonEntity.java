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
//		원래는 이렇게 하지만
//		this.name = name;
//		this.ssn = ssn;
//		this.address = address;
//		this.phone = phone;

//		생성자를 통해 변수 초기화하는 방법도 있음
		setSsn(ssn);
		setName(name);
		setAddress(address);
		setPhone(phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
		// 주민번호가 0508073347558라면 성별은 index 6
		char genderNum = ssn.charAt(6);
		if(genderNum == '1' || genderNum == '3') {
			// this.gender = '남'; // 이거보다는 setter method 써도 됨
			setGender('남');
		} else {
			setGender('여');
		}
		
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
