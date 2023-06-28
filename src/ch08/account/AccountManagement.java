package ch08.account;

public class AccountManagement {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.deposit(5000.0);
        account2.deposit(10000.0);
        account1.withdraw(2000.0);
        account2.withdraw(15000.0);
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());


    }
}
