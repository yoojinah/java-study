package ch08.abstractClass;

abstract public class Account {
    private String accountNum;  // 계좌번호
    protected double balance; //   잔액



    public Account(String accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }


    public void deposit(double amont){
        balance += amont;
    }

    public void withdraw(double amount){
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("출금할 잔액이 부족합니다.");
        }
    }

    abstract void endMonth(); // 추상 메서드 : 매월 말에 실행


}
