package mylab.bank.entity;

import mylab.bank.exception.InsufficientBalanceException;
import mylab.bank.exception.WithdrawalLimitExceededException;

public class CheckingAccount extends Account {
	
	private double withdrawalLimit;  //출금 한도

    public CheckingAccount(String accountNumber, String ownerName, double initialBalance, double withdrawalLimit) {
        super(accountNumber, ownerName, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    //출금 한도
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    //출금
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > withdrawalLimit) {
            throw new WithdrawalLimitExceededException("출금 한도를 초과했습니다. 한도: " + withdrawalLimit + "원");
        }
        //잔액 부족 확인하기
        super.withdraw(amount);
    }

    //계좌 정보
    @Override
    public String toString() {
        return super.toString() + ", 출금 한도: " + getWithdrawalLimit() + "원";
    }
}