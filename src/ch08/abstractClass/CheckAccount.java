package ch08.abstractClass;

public class CheckAccount extends Account{

    // initialBalance 초기잔액
    public CheckAccount(String accountNum, double balance) {
        super(accountNum, balance);
    }
    @Override
    void endMonth(){
        System.out.println("--" + balance);
    }
}
