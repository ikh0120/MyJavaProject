package workshop.account.entity;

public class Account {
	private String custId;
	private String acctId;
	private int balance;
	
	
	// 자동으로 Getter Setter 메서드 만들어줌
	// Source/Generate Getters and Setters/
	
	// Setter
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// Getter
	public int getBalance() {
		return balance;
	}
	public String getCustId() {
		return custId;
	}
	public String getAcctId() {
		return acctId;
	}
	
	
}
