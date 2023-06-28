package ch08.ex02;

public class Account implements Taxable, Bankable, Loanable{

    private double balance;   // 잔액


    @Override
    public double calculateTax() {
        return balance * 0.1;
    }


    // 입금 메서드 오버로딩
    @Override
    public void deposit(double amount){
        balance += amount;
    }

    double deposit() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("계좌에 출금할 충분한 잔액이 없습니다.");
        }
    }

    @Override
    public double calculateInterest(double loanAmount) {
        return loanAmount * 0.05;

    }







}
