package ch06.map.account;

public class Account {
    private String accountNumber;   // 계좌번호
    private double balance;         // 잔액

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }
    void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;

    }



    // 계좌 객체에 잔액 증가 (입금)
    public void deposit(double amount) {
        // **코드 작성
        this.balance += amount;
        // 입금 금액 만큼 해당 계좌객체에 잔고(balance) 추가

    }



    //계좌 객체에 잔액 차감
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("출금할 잔액이 부족합니다.");
        }

    }


}


