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
	
	// 입금
	public void deposit(int amount) {
		this.balance += amount;
	}
	// 출금
	public void withdraw(int amount) {
		if(amount > balance) {
			System.out.println("잔액부족");
		}
		this.balance -= amount;
	}
	
}
