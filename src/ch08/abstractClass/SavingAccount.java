package ch08.abstractClass;

public class SavingAccount extends Account{

    private double interestRate;  // 이자율

    public SavingAccount(String accountNum, double balance, double interestRate) {
        super(accountNum, balance);
        this.interestRate = interestRate;
    }


    @Override
    void endMonth(){
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("");

    }
}
