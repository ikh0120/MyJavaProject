package mylab.bank.entity;

import mylab.bank.exception.InsufficientBalanceException;
import mylab.bank.exception.WithdrawalLimitExceededException;

public class CheckingAccount extends Account {
	
	private double withdrawalLimit;  //��� �ѵ�

    public CheckingAccount(String accountNumber, String ownerName, double initialBalance, double withdrawalLimit) {
        super(accountNumber, ownerName, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    //��� �ѵ�
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    //���
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > withdrawalLimit) {
            throw new WithdrawalLimitExceededException("��� �ѵ��� �ʰ��߽��ϴ�. �ѵ�: " + withdrawalLimit + "��");
        }
        //�ܾ� ���� Ȯ���ϱ�
        super.withdraw(amount);
    }

    //���� ����
    @Override
    public String toString() {
        return super.toString() + ", ��� �ѵ�: " + getWithdrawalLimit() + "��";
    }
}