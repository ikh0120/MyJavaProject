package workshop.account.exception;

public class InsufficientBalanceException extends Exception{
	// private String errMessage;
	public InsufficientBalanceException(String errMessage) {
		// 부모의 생성자를 호출
		// this.errMessage = errMessage;
		super(errMessage); // 따로 만들지 말고 부모 클래스에서 넘겨받음
		
	}
}
