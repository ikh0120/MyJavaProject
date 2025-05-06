package mylab.bank.control;

import mylab.bank.entity.*;
import mylab.bank.exception.*;

public class BankDemo {
    public static void main(String[] args) {
    	
        Bank bank = new Bank();
        
        System.out.println("=== ���� ���� ===");

        bank.createSavingsAccount("ȫ�浿", 10000.0, 0.03);    //������ 3%
        bank.createCheckingAccount("��ö��", 20000.0, 5000.0); //��� �ѵ� 5000
        bank.createSavingsAccount("�̿���", 30000.0, 0.02);    //������ 2%
        System.out.println();

        //��� ���� ���
        bank.printAllAccounts();
        System.out.println();
        
        System.out.println("=== �Ա�/��� �׽�Ʈ ===");
        //�� ��� �׽�Ʈ
        try {
            bank.deposit("AC1000", 5000.0);  //ȫ�浿
            bank.withdraw("AC1001", 3000.0);
        } catch (AccountNotFoundException e) {
            System.out.println("���� �߻�: " + e.getMessage());
        }
        System.out.println();
        
        System.out.println("=== ���� ���� �׽�Ʈ ===");
        //���� ���� �׽�Ʈ
        try {
            bank.applyInterest("AC1000");  //ȫ�浿�� �������
        } catch (AccountNotFoundException e) {
            System.out.println("���� �߻�: " + e.getMessage());
        }
        System.out.println();

        System.out.println("=== ���� ��ü �׽�Ʈ ===");
        //���� ��ü �׽�Ʈ
        try {
            bank.transfer("AC1002", "AC1001", 5000.0); // �̿��� ��ö������
        } catch (AccountNotFoundException e) {
            System.out.println("���� �߻�: " + e.getMessage());
        }
        System.out.println();

        //��� ���� ���
        System.out.println("=== ��� ���� ��� ===");
        bank.printAllAccounts();
        System.out.println("===================");

        //���� �׽�Ʈ
        try {
            bank.withdraw("AC1001", 6000.0);  //�ѵ� �ʰ�
        } catch (AccountNotFoundException e) {
            System.out.println("���� �߻�: " + e.getMessage());
        }

        try {
            bank.withdraw("AC1001", 6000.0);  //�ٽ� �ѵ� �ʰ�
        } catch (AccountNotFoundException e) {
            System.out.println("���� �߻�: " + e.getMessage());
        }

        try {
            bank.deposit("AC9999", 1000.0);  //���� ����
        } catch (AccountNotFoundException e) {
            System.out.println("���� �߻�: " + e.getMessage());
        }
    }
}