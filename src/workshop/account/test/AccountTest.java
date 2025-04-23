package workshop.account.test;

import workshop.account.entity.Account;

public class AccountTest {
	public static void main(String[] args) {
		// Account 객체 
		Account account = new Account("A1100", "221-22-3477", 100000);
		
		//자동으로 System.out.println()은  toString()을 가져옴
		// 원래는 workshop.account.entity.Account@2a139a55 이거 출력
		// 부모 메서드를 재정의(Overriding)해서 원하는대로 만들 수 있음 
		System.out.println(account);
//		System.out.println(account.toString());
		System.out.println("고객번호: "+ account.getCustId());
		System.out.println("계좌번호: "+ account.getAcctId());
		System.out.println("잔액: "+ account.getBalance());
		
		System.out.println("10000원 입금");
		account.deposit(10000);
		System.out.println("잔액: "+ account.getBalance());
		
		System.out.println("20000원 출금");
		account.withdraw(20000);
		System.out.println("잔액: "+ account.getBalance());
		
		account.withdraw(100000);
		System.out.println("잔액: "+ account.getBalance());
		
		
		
	}
}
