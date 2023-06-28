package ch08.account;

public class BankAccount {
    private String accountNumber;  // 계좌번호
    private String owner;  // 예금주
    private double balance;  // 잔액


    // 입금 메서드
    public void deposit(double amount) {
        this.balance += amount;
    }

    // 출금 메서드
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("출금할 잔액이 부족합니다.");
        }
    }

    double getBalance() {
        return balance;
    }
}
